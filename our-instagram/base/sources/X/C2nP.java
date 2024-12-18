package X;

import android.content.res.Resources;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2nP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2nP {
    public final Resources A00;
    public final C27771Wf A01;
    public final InterfaceC59172nI A02;
    public final Map A03;
    public final boolean A04;

    public final boolean A00(C2nP c2nP, boolean z) {
        boolean A00;
        if (this == c2nP) {
            return true;
        }
        if (c2nP != null && this.A00 == c2nP.A00 && C6VP.A00(this.A02, c2nP.A02)) {
            C27771Wf c27771Wf = this.A01;
            C27771Wf c27771Wf2 = c2nP.A01;
            if (z) {
                if (c27771Wf == c27771Wf2) {
                    return true;
                }
                if (c27771Wf.A02 == c27771Wf2.A02 && C6VP.A00(c27771Wf.A0B, c27771Wf2.A0B) && C6VP.A00(c27771Wf.A06, c27771Wf2.A06) && c27771Wf.A0U == c27771Wf2.A0U && C6VP.A00(c27771Wf.A0I, c27771Wf2.A0I)) {
                    A00 = c27771Wf.A00(c27771Wf2);
                }
            } else {
                A00 = C6VP.A00(c27771Wf, c27771Wf2);
            }
            if (A00) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C2nP c2nP = (C2nP) obj;
            if (this.A00 != c2nP.A00 || !C6VP.A00(this.A02, c2nP.A02) || !C6VP.A00(this.A01, c2nP.A01)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ C2nP(Resources resources, C27771Wf c27771Wf, InterfaceC59172nI interfaceC59172nI, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A00 = resources;
        this.A02 = interfaceC59172nI;
        this.A01 = c27771Wf;
        this.A04 = z;
        this.A03 = linkedHashMap;
    }

    public final int hashCode() {
        return (((this.A00.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode();
    }
}
