package X;

import android.content.Context;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.user.model.FollowStatus;

/* renamed from: X.Pgm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57574Pgm extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ CardView A02;
    public final /* synthetic */ IgImageView A03;
    public final /* synthetic */ Reel A04;
    public final /* synthetic */ InterfaceC64002vL A05;
    public final /* synthetic */ C3P2 A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57574Pgm(Context context, View view, CardView cardView, IgImageView igImageView, Reel reel, InterfaceC64002vL interfaceC64002vL, C3P2 c3p2, boolean z) {
        super(1);
        this.A04 = reel;
        this.A00 = context;
        this.A01 = view;
        this.A03 = igImageView;
        this.A02 = cardView;
        this.A07 = z;
        this.A05 = interfaceC64002vL;
        this.A06 = c3p2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        C14360o3.A0B(followStatus, 0);
        IgImageView igImageView = this.A03;
        Context context = this.A00;
        CardView cardView = this.A02;
        AbstractC110954z7.A00(context, cardView, igImageView, followStatus);
        Reel reel = this.A04;
        if (reel.A0P == ReelType.A0i && followStatus == FollowStatus.A05) {
            reel.A0P = ReelType.A0n;
        }
        C14360o3.A0A(context);
        if (followStatus == FollowStatus.A07) {
            C9GR.A07(context, 2131962771);
        }
        this.A01.postDelayed(new RunnableC57076PTp(context, cardView, reel, this.A05, this.A06, this.A07), 1000L);
        return C0eB.A00;
    }
}
