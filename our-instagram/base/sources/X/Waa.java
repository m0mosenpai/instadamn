package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class Waa implements InterfaceC72013XFb {
    public final int A00;
    public final Object[] A01;

    @Override // X.InterfaceC72013XFb
    public final CharSequence C2i(Context context) {
        C14360o3.A0B(context, 0);
        int i = this.A00;
        if (i == 0) {
            return null;
        }
        Object[] objArr = this.A01;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (obj instanceof InterfaceC72013XFb) {
                obj = ((InterfaceC72013XFb) obj).C2i(context);
            }
            arrayList.add(obj);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        return context.getString(i, Arrays.copyOf(array, array.length));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Waa)) {
            return false;
        }
        Waa waa = (Waa) obj;
        if (this.A00 != waa.A00 || !Arrays.equals(this.A01, waa.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XMLStringResource(stringRes=");
        sb.append(this.A00);
        sb.append(", titleResArgs=");
        return AbstractC25236BEt.A0Y(Arrays.toString(this.A01), sb);
    }

    public Waa(Object[] objArr, int i) {
        this.A00 = i;
        this.A01 = objArr;
    }
}
