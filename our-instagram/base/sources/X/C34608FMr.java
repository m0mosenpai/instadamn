package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.fx.igxfb.IgxfbNetEgoCTABannerParams;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.FMr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34608FMr {
    public Context A00;
    public UserSession A01;
    public IgxfbNetEgoCTABannerParams A02;
    public UserDetailFragment A03;
    public final C18920wW A04;

    public C34608FMr(Context context, C18920wW c18920wW, UserSession userSession, IgxfbNetEgoCTABannerParams igxfbNetEgoCTABannerParams, UserDetailFragment userDetailFragment) {
        AbstractC25233BEq.A0x(3, userSession, c18920wW, igxfbNetEgoCTABannerParams);
        this.A00 = context;
        this.A03 = userDetailFragment;
        this.A01 = userSession;
        this.A04 = c18920wW;
        this.A02 = igxfbNetEgoCTABannerParams;
    }
}
