package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* renamed from: X.7Dg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159457Dg {
    public ImageUrl A00;
    public IgTextView A01;
    public StackedAvatarView A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final AbstractC59962oe A07;
    public final UserSession A08;
    public final boolean A09;

    public C159457Dg(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, String str) {
        C14360o3.A0B(str, 4);
        this.A06 = context;
        this.A07 = abstractC59962oe;
        this.A08 = userSession;
        this.A09 = str.equals("follow_button");
    }
}
