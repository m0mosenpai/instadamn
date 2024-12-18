package X;

import android.content.Context;
import com.facebook.litho.ComponentTree;

/* renamed from: X.3aY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75673aY {
    public int A00;
    public ComponentTree A01;
    public final C07X A02;
    public final C2V3 A03;
    public final C2V6 A04;
    public final boolean A05;

    public C75673aY(Context context, C07X c07x, C2V3 c2v3, C2V6 c2v6, boolean z) {
        C2VF c2vf;
        this.A03 = c2v3;
        this.A02 = c07x;
        this.A05 = z;
        this.A04 = c2v6;
        C75713ac c75713ac = new C75713ac(new C2XE(context));
        C2V3 c2v32 = this.A03;
        c2v32 = c2v32 == null ? C2V3.defaultInstance : c2v32;
        if (this.A05) {
            c2vf = C2VF.A00;
        } else {
            c2vf = null;
        }
        C2V6 c2v62 = this.A04;
        c75713ac.A06 = C2V3.A00(null, c2v32, c2vf, c2v62 == null ? C2V3.defaultInstance.A03 : c2v62, null, null, null, null, -801, 31, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        C07X c07x2 = this.A02;
        if (c07x2 != null) {
            c75713ac.A03 = new C89273yT(c07x2);
        }
        this.A01 = c75713ac.A00();
    }
}
