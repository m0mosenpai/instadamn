package X;

import android.view.View;
import com.facebook.litho.LithoView;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Ghr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37658Ghr extends AbstractC170917ji {
    public InstagramMidcardType A00;
    public C120985dq A01;
    public boolean A02;
    public boolean A03;
    public final C2XI A04;
    public final LithoView A05;
    public final RoundedCornerFrameLayout A06;
    public final C25370BKn A07;
    public final C39690HjM A08;
    public final C41217IMg A09;
    public final HashMap A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.HjM] */
    public C37658Ghr(View view, C2XI c2xi, C25370BKn c25370BKn, C41217IMg c41217IMg, HashMap hashMap, List list, List list2, List list3) {
        super(view);
        C39690HjM c39690HjM;
        C14360o3.A0B(c2xi, 11);
        this.A09 = c41217IMg;
        this.A0B = list;
        this.A07 = c25370BKn;
        this.A0C = list2;
        this.A0A = hashMap;
        this.A0D = list3;
        this.A00 = null;
        this.A02 = false;
        this.A03 = false;
        this.A04 = c2xi;
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) view;
        this.A06 = roundedCornerFrameLayout;
        View childAt = roundedCornerFrameLayout.getChildAt(0);
        C14360o3.A0C(childAt, "null cannot be cast to non-null type com.facebook.litho.LithoView");
        LithoView lithoView = (LithoView) childAt;
        this.A05 = lithoView;
        if (c41217IMg == null) {
            c39690HjM = null;
        } else {
            C14360o3.A0B(lithoView, 1);
            ?? obj = new Object();
            obj.A00 = lithoView;
            c39690HjM = obj;
        }
        this.A08 = c39690HjM;
    }

    @Override // X.AbstractC170917ji
    public final void A01(LithoView lithoView, int i, int i2, int i3, int i4, boolean z) {
    }

    @Override // X.AbstractC170917ji
    public final LithoView A00() {
        return this.A05;
    }
}
