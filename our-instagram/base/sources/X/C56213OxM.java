package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.PhotoSession;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.OxM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56213OxM implements InterfaceC58030PoG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass841 A02;
    public final /* synthetic */ AtomicInteger A03;
    public final /* synthetic */ boolean A04;

    public C56213OxM(Context context, UserSession userSession, AnonymousClass841 anonymousClass841, AtomicInteger atomicInteger, boolean z) {
        this.A03 = atomicInteger;
        this.A00 = context;
        this.A02 = anonymousClass841;
        this.A01 = userSession;
        this.A04 = z;
    }

    @Override // X.InterfaceC58030PoG
    public final /* synthetic */ void AGo() {
    }

    @Override // X.InterfaceC58030PoG
    public final void AGm() {
        UserSession userSession;
        AbstractC50697MZs c52501NKu;
        if (this.A03.decrementAndGet() != 0) {
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
        AnonymousClass841 anonymousClass841 = this.A02;
        CreationSession creationSession = ((MX5) anonymousClass841).A01;
        EnumC69983Ch enumC69983Ch = creationSession.A0A;
        enumC69983Ch.getClass();
        if (enumC69983Ch != EnumC69983Ch.A05) {
            EnumC69983Ch enumC69983Ch2 = creationSession.A0A;
            enumC69983Ch2.getClass();
            if (enumC69983Ch2 != EnumC69983Ch.A03) {
                EnumC69983Ch enumC69983Ch3 = creationSession.A0A;
                enumC69983Ch3.getClass();
                if (enumC69983Ch3 == EnumC69983Ch.A06) {
                    fragmentActivity.finish();
                    AbstractC25651Mw.A00(this.A01).A05(new C55986OtJ(anonymousClass841.E4J()));
                    return;
                }
                if (this.A04) {
                    PhotoSession A02 = creationSession.A02();
                    A02.getClass();
                    A02.A0E.ELh();
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
        }
        String E4J = anonymousClass841.E4J();
        String E3z = anonymousClass841.E3z();
        if (E3z != null) {
            Intent intent = new Intent(E4J);
            intent.putExtra("pending_media_key", E3z);
            AbstractC31180DnO.A0y(fragmentActivity, intent);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
