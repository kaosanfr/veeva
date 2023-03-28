const React = require('react'); // <1>
const Map = require("react-leaflet");// <3>
const GeoJSON = require("react-leaflet");// <3>
const worldGeoJSON = require("geojson-world-map");
class MyMap extends React.Component { // <1>

    constructor() {

        super();

    }

     getCountries() {

        const response =  fetch('https://d2ad6b4ur7yvpq.cloudfront.net/naturalearth-3.3.0/ne_110m_admin_0_countries.geojson',
            {

                headers: {
                    'Content-Type': 'application/json',
                    'Accept': 'application/json'
                }
            }
        );

        const data =   response.json();

    }

    componentDidMount() {
    }


    //countryStyle= { fillColor: "blue", fillOpacity:0.1, color:"black", weight:2};
    render() {

        return (
            <div>
                <h1 style={{textAlign: "center"}}>My Map</h1>
                <Map
                center={[20, 100]}
                zoom={2}
                maxZoom={10}
                attributionControl={true}
                zoomControl={true}
                doubleClickZoom={true}
                scrollWheelZoom={true}
                dragging={true}
                animate={true}
                easeLinearity={0.35}
                >
                    <GeoJSON
                        data={worldGeoJSON}
                        style={() => ({
                            color: '#4a83ec',
                            weight: 0.5,
                            fillColor: "#1a1d62",
                            fillOpacity: 1,
                        })}
                    />
                </Map>
            </div>
        );
    }
}

export default MyMap

