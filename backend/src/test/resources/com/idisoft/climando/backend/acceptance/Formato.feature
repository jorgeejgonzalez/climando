Feature: Formateo de Datos

	Scenario: Creacion de Observacion
		Given que se solicito la informacion del servicio REST exitosamente
		When procesemos el la entidad de respuesta
		Then la nueva Observacion no sera nula