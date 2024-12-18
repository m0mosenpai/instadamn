package X;

import com.facebookpay.logging.LoggingContext;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* loaded from: classes8.dex */
public final class MIM extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIM(Object obj, Object obj2, String str, int i, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A01 = i;
        this.A05 = str;
        this.A04 = obj;
        this.A02 = i2;
        this.A03 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        switch (this.A00) {
            case 0:
                C25531Mh c25531Mh = (C25531Mh) obj;
                C0Zx c0Zx = new C0Zx();
                LoggingContext loggingContext = (LoggingContext) this.A04;
                AbstractC43594JPz.A1E(c0Zx, loggingContext);
                c0Zx.A06("target_name", this.A05);
                c0Zx.A05("user_input_len", AbstractC31171DnF.A0V(this.A02));
                c0Zx.A05("selected_option", AbstractC31171DnF.A0V(this.A01));
                C44872Jtm A00 = AbstractC63059Sbg.A00(loggingContext);
                if (A00 != null) {
                    c0Zx.A02(A00, "logging_policy");
                }
                AbstractC43592JPx.A1M(c25531Mh, c0Zx);
                AbstractC43593JPy.A1M(c25531Mh, this.A03);
                return c25531Mh;
            case 1:
                String A0Q = AbstractC167027dH.A0Q(obj);
                InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) this.A03;
                if (A0Q.length() > this.A01) {
                    obj2 = new C26179Bi4(this.A05);
                } else {
                    obj2 = C29183Cto.A00;
                }
                interfaceC74953Yl.Egh(obj2);
                ((InterfaceC16620sF) this.A04).invoke(Integer.valueOf(this.A02), A0Q);
                return C0eB.A00;
            default:
                C25531Mh c25531Mh2 = (C25531Mh) obj;
                C14360o3.A0B(c25531Mh2, 0);
                c25531Mh2.A0X(this.A01);
                c25531Mh2.A0R("creation_session_id", this.A04.toString());
                c25531Mh2.A0M((EnumC33519Ers) this.A03, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                c25531Mh2.A0O("is_e2ee", false);
                c25531Mh2.A0Y(this.A02);
                c25531Mh2.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, this.A05);
                c25531Mh2.A0M(EnumC72433Xdd.A02, "thread_type");
                c25531Mh2.A0Z(36);
                return C0eB.A00;
        }
    }
}
