package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.PhotoSession;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.OxN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56214OxN implements InterfaceC58030PoG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ PhotoSession A02;
    public final /* synthetic */ EnumC69983Ch A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ AtomicInteger A06;
    public final /* synthetic */ boolean A07;

    public C56214OxN(Context context, UserSession userSession, PhotoSession photoSession, EnumC69983Ch enumC69983Ch, String str, String str2, AtomicInteger atomicInteger, boolean z) {
        this.A06 = atomicInteger;
        this.A00 = context;
        this.A03 = enumC69983Ch;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = userSession;
        this.A07 = z;
        this.A02 = photoSession;
    }

    @Override // X.InterfaceC58030PoG
    public final /* synthetic */ void AGo() {
    }

    @Override // X.InterfaceC58030PoG
    public final void AGm() {
        UserSession userSession;
        AbstractC50697MZs c52501NKu;
        if (this.A06.decrementAndGet() != 0) {
            C0K8.A0C("MediaSaveHelper", "captureCompleted(): return early from renderCounter.");
            return;
        }
        Context context = this.A00;
        C14360o3.A0C(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        AbstractC10360h2 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        C14360o3.A07(supportFragmentManager);
        if (!C06P.A01(supportFragmentManager)) {
            return;
        }
        EnumC69983Ch enumC69983Ch = this.A03;
        if (enumC69983Ch != EnumC69983Ch.A05 && enumC69983Ch != EnumC69983Ch.A03) {
            if (enumC69983Ch == EnumC69983Ch.A06) {
                fragmentActivity.finish();
                AbstractC25651Mw.A00(this.A01).A05(new C55986OtJ(this.A05));
                return;
            }
            if (this.A07) {
                this.A02.A0E.ELh();
                userSession = this.A01;
                c52501NKu = new C52497NKq();
            } else {
                C0K8.A0C("MediaSaveHelper", "captureCompleted(): Safe to commit stateful transactions. Post creation event to navigate to the next screen.");
                userSession = this.A01;
                c52501NKu = new C52501NKu();
            }
            C50695MZq.A00(userSession, c52501NKu);
            return;
        }
        String str = this.A05;
        String str2 = this.A04;
        if (str2 != null) {
            C14360o3.A0B(str, 0);
            Intent intent = new Intent(str);
            intent.putExtra("pending_media_key", str2);
            AbstractC31180DnO.A0y(fragmentActivity, intent);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
