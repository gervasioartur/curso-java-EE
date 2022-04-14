/**
 * Validations
 */

function validate() {
	let name = fomrContact.name.value
	let phone = fomrContact.phone.value

	if (!name) {
		alert('O campo nome e obrigatorio')
		fomrContact.name.focus()
		return false
	}

	if (!phone) {
		alert('O campo nr de celular e obrigatorio')
		fomrContact.name.focus()
		return false
	}

	document.forms["fomrContact"].submit();

}