package X;

import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.Xq9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72875Xq9 {
    public static Person A00(Y3n y3n) {
        Person.Builder name = new Person.Builder().setName(y3n.A01);
        IconCompat iconCompat = y3n.A00;
        Icon icon = null;
        if (iconCompat != null) {
            icon = AbstractC58497PwQ.A00(null, iconCompat);
        }
        return name.setIcon(icon).setUri(y3n.A03).setKey(y3n.A02).setBot(y3n.A04).setImportant(y3n.A05).build();
    }

    public static Y3n A01(Person person) {
        IconCompat iconCompat;
        CharSequence name = person.getName();
        if (person.getIcon() != null) {
            iconCompat = AbstractC58497PwQ.A01(person.getIcon());
        } else {
            iconCompat = null;
        }
        return new Y3n(iconCompat, name, person.getKey(), person.getUri(), person.isBot(), person.isImportant());
    }
}
