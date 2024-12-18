package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.CameraTool;
import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.magicmod.model.MagicModLaunchParams;

/* renamed from: X.D8z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29729D8z extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ CameraTool A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ MagicModLaunchParams A03;
    public final /* synthetic */ C8CS A04;
    public final /* synthetic */ C183978Ee A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29729D8z(FragmentActivity fragmentActivity, CameraTool cameraTool, UserSession userSession, MagicModLaunchParams magicModLaunchParams, C8CS c8cs, C183978Ee c183978Ee, Integer num, String str, boolean z) {
        super(0);
        this.A04 = c8cs;
        this.A06 = num;
        this.A05 = c183978Ee;
        this.A01 = cameraTool;
        this.A02 = userSession;
        this.A08 = z;
        this.A03 = magicModLaunchParams;
        this.A07 = str;
        this.A00 = fragmentActivity;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C8CS c8cs = this.A04;
        Integer num = this.A06;
        C183978Ee c183978Ee = this.A05;
        CameraTool cameraTool = this.A01;
        UserSession userSession = this.A02;
        boolean z = this.A08;
        CYJ.A00(this.A00, cameraTool, userSession, this.A03, c8cs, c183978Ee, num, this.A07, z);
        return C0eB.A00;
    }
}
