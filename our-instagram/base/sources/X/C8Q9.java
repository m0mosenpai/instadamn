package X;

import android.view.View;
import com.facebook.common.dextricks.JITProfilePQR;
import go.Seq;

/* renamed from: X.8Q9, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C8Q9 extends C03E implements InterfaceC16620sF {
    public C8Q9(Object obj) {
        super(2, obj, C8Q6.class, "buttonOnClickListener", "buttonOnClickListener(Landroid/view/View;Lcom/instagram/creation/capture/quickcapture/actionbar/ButtonName;)V", 0);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        View view = (View) obj;
        EnumC53325Ni3 enumC53325Ni3 = (EnumC53325Ni3) obj2;
        C14360o3.A0B(view, 0);
        C14360o3.A0B(enumC53325Ni3, 1);
        C8Q6 c8q6 = (C8Q6) this.receiver;
        switch (enumC53325Ni3.ordinal()) {
            case 1:
                C150286pc c150286pc = c8q6.A0s.A00.A1b;
                if (c150286pc != null) {
                    ((C191478dz) c150286pc.get()).A0K();
                    break;
                }
                break;
            case 3:
                C8Q6.A02(view, c8q6);
                break;
            case 4:
                c8q6.A0s.A0C();
                if (c8q6.A18) {
                    view.performClick();
                    break;
                }
                break;
            case 6:
                c8q6.A0s.A02();
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                c8q6.A0s.A06();
                break;
            case 16:
                c8q6.A0s.A00.A1N.E4u(new Object());
                AnonymousClass229.A01(c8q6.A0f).A1D(EnumC203578zI.POST_CAPTURE_UTILITY_TOOLBAR);
                break;
            case 25:
                C8Q6.A0H(c8q6);
                break;
            case 30:
                c8q6.A0s.A0A();
                break;
            case 39:
                c8q6.A0s.A00.A1N.E4u(new Object());
                break;
            case Seq.NULL_REFNUM /* 41 */:
                c8q6.A0s.A00.A1N.E4u(new Object());
                break;
        }
        return C0eB.A00;
    }
}
