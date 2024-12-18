package X;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Sg2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63247Sg2 {
    public static void A01(C46g multimap, ObjectInputStream stream, int distinctKeys) {
        for (int i = 0; i < distinctKeys; i++) {
            Collection AXV = multimap.AXV(stream.readObject());
            int readInt = stream.readInt();
            for (int i2 = 0; i2 < readInt; i2++) {
                AXV.add(stream.readObject());
            }
        }
    }

    public static C62648SKh A00(Class clazz, String fieldName) {
        try {
            return new C62648SKh(clazz.getDeclaredField(fieldName));
        } catch (NoSuchFieldException e) {
            throw AbstractC58318PtA.A0W(e);
        }
    }

    public static void A02(C46g multimap, ObjectOutputStream stream) {
        stream.writeInt(multimap.ACe().size());
        Iterator A15 = AbstractC166997dE.A15(multimap.ACe());
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            stream.writeObject(A1K.getKey());
            stream.writeInt(AbstractC58318PtA.A0y(A1K).size());
            Iterator it = AbstractC58318PtA.A0y(A1K).iterator();
            while (it.hasNext()) {
                stream.writeObject(it.next());
            }
        }
    }

    public static void A03(InterfaceC75173Zi multiset, ObjectOutputStream stream) {
        stream.writeInt(multiset.entrySet().size());
        for (AbstractC62759SPq abstractC62759SPq : multiset.entrySet()) {
            stream.writeObject(abstractC62759SPq.A01());
            stream.writeInt(abstractC62759SPq.A00());
        }
    }
}
