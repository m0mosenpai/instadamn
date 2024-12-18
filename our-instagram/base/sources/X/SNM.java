package X;

import com.facebook.react.modules.dialog.DialogModule;

/* loaded from: classes10.dex */
public final class SNM {
    public final String A00;

    public SNM(String str) {
        AbstractC63311ShH.A04(str, DialogModule.KEY_TITLE);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof SNM) && C14360o3.A0K(this.A00, ((SNM) obj).A00));
    }

    public final int hashCode() {
        return AbstractC63311ShH.A02(this.A00);
    }
}
