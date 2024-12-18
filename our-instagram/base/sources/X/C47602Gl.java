package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Gl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47602Gl implements InterfaceC47612Gm, Cloneable {
    public static final C47602Gl A02 = new C47602Gl();
    public List A01 = Collections.emptyList();
    public List A00 = Collections.emptyList();

    public static boolean A00(Class cls) {
        if (!Enum.class.isAssignableFrom(cls) && (cls.getModifiers() & 8) == 0) {
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC47612Gm
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        if (!A00(typeToken.rawType)) {
            Iterator it = this.A01.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("shouldSkipClass");
            }
            Iterator it2 = this.A00.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw new NullPointerException("shouldSkipClass");
            }
            return null;
        }
        return new C60843RVd(gson, this, typeToken);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
