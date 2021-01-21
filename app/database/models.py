

from app.database.connection import db


class Users(db.Document):

    credentials = db.StringField(required = True)
    name = db.StringField(required = True)
    last_name = db.StringField(required = True)
    phone_number = db.StringField(required = True)
    email_address = db.StringField(required = True)
    department = db.StringField(required = True)