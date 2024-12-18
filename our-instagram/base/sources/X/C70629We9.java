package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.We9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70629We9 implements XA6 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C67884V0q A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C70629We9(FragmentActivity fragmentActivity, C67884V0q c67884V0q, String str, String str2, String str3) {
        this.A00 = fragmentActivity;
        this.A01 = c67884V0q;
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
    }

    @Override // X.XA6
    public final void onComplete() {
        FragmentActivity fragmentActivity = this.A00;
        InterfaceC09390do interfaceC09390do = this.A01.A0F;
        AbstractC70398WUa.A02(fragmentActivity, (UserSession) interfaceC09390do.getValue(), this.A02, this.A04, this.A03, AbstractC43594JPz.A0N(interfaceC09390do).A03, "ig_boost", null, false);
    }
}
