package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.GifUrlImpl;
import java.util.concurrent.TimeUnit;

/* renamed from: X.LoA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49131LoA implements C7QC {
    public static final long A05 = TimeUnit.SECONDS.toMillis(3);
    public final UserSession A00;
    public final InterfaceC165247aD A01;
    public final InterfaceC163587Tv A02;
    public final C162907Rb A03;
    public final AnonymousClass988 A04;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C49165Loi c49165Loi = new C49165Loi(AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.direct_gif_message_with_big_heart, false));
        this.A03.A00(c49165Loi);
        return c49165Loi;
    }

    public static final void A00(Context context, C49131LoA c49131LoA, C49165Loi c49165Loi, GifUrlImpl gifUrlImpl, String str, String str2) {
        AnonymousClass988 anonymousClass988 = c49131LoA.A04;
        if (!AbstractC167007dF.A1Z(anonymousClass988.A1H)) {
            c49165Loi.A04.post(new M49(AbstractC46825KnK.A00(context, c49131LoA.A00, new GifUrlImpl(str, gifUrlImpl.A03.floatValue(), gifUrlImpl.A02.floatValue()), null, str2), c49165Loi));
        } else {
            RunnableC50033M6w runnableC50033M6w = new RunnableC50033M6w(context, c49131LoA, c49165Loi, gifUrlImpl, str, str2);
            c49165Loi.A02 = runnableC50033M6w;
            c49165Loi.A04.postDelayed(runnableC50033M6w, AbstractC166987dD.A0N(anonymousClass988.A0I.getValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @Override // X.C7QC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADy(X.C7QD r21, X.InterfaceC129555tK r22) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49131LoA.ADy(X.7QD, X.5tK):void");
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C49165Loi c49165Loi = (C49165Loi) c7qd;
        C14360o3.A0B(c49165Loi, 0);
        IgImageView igImageView = c49165Loi.A04;
        igImageView.setTag(null);
        Runnable runnable = c49165Loi.A02;
        if (runnable != null) {
            igImageView.removeCallbacks(runnable);
        }
        c49165Loi.A02 = null;
        c49165Loi.A07.removeCallbacks(c49165Loi.A08);
        L7B l7b = c49165Loi.A01;
        if (l7b != null) {
            l7b.A00();
        }
        C47349Kvy c47349Kvy = c49165Loi.A00;
        if (c47349Kvy != null) {
            c47349Kvy.A00.set(true);
        }
        c49165Loi.A01 = null;
        c49165Loi.A00 = null;
        this.A03.A01(c49165Loi);
    }

    public C49131LoA(UserSession userSession, InterfaceC165247aD interfaceC165247aD, InterfaceC163587Tv interfaceC163587Tv, AnonymousClass988 anonymousClass988, C162907Rb c162907Rb) {
        this.A00 = userSession;
        this.A01 = interfaceC165247aD;
        this.A02 = interfaceC163587Tv;
        this.A03 = c162907Rb;
        this.A04 = anonymousClass988;
    }
}
