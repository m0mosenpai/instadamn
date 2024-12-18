package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.ui.text.BulletAwareTextView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.textview.IgTextLayoutView;
import com.instagram.user.follow.FollowButtonBase;
import go.Seq;

/* renamed from: X.GSu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37015GSu extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37015GSu(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        int i;
        Object obj2;
        int i2;
        switch (this.A00) {
            case 0:
            case 4:
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
                return new C50850Mdh(abstractC59962oe.requireArguments(), abstractC59962oe, abstractC59962oe);
            case 1:
            case 5:
                return this.A01;
            case 2:
            case 6:
                return AbstractC25226BEj.A1C(this.A01);
            case 3:
            case 7:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 8:
                AbstractC59962oe abstractC59962oe2 = (AbstractC59962oe) this.A01;
                return new C50849Mdg(abstractC59962oe2.requireArguments(), abstractC59962oe2, abstractC59962oe2);
            case 9:
                return new O3X((UserSession) this.A01);
            case 10:
                return new C51753Mtc[((InterfaceC19390xP[]) this.A01).length];
            case 11:
                return new String[((InterfaceC19390xP[]) this.A01).length];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 16:
            case 21:
                ((IgImageView) this.A01).A09();
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                CircularImageView circularImageView = (CircularImageView) this.A01;
                circularImageView.setStrokeAlpha(circularImageView.A00);
                return C0eB.A00;
            case 14:
                C3PF c3pf = (C3PF) this.A01;
                if (c3pf != null) {
                    c3pf.A02();
                    c3pf.A03();
                }
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                ((GradientSpinner) this.A01).A02();
                return C0eB.A00;
            case 17:
                FollowButtonBase followButtonBase = ((FollowButtonBase) this.A01).A0J.A0R;
                followButtonBase.setOnClickListener(null);
                followButtonBase.setOnLongClickListener(null);
                ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = followButtonBase.A0J;
                viewOnAttachStateChangeListenerC110564yT.A09 = null;
                viewOnAttachStateChangeListenerC110564yT.A08 = null;
                viewOnAttachStateChangeListenerC110564yT.A0M = false;
                viewOnAttachStateChangeListenerC110564yT.A0B = null;
                viewOnAttachStateChangeListenerC110564yT.A0O = false;
                viewOnAttachStateChangeListenerC110564yT.A0A = null;
                viewOnAttachStateChangeListenerC110564yT.A0N = false;
                return C0eB.A00;
            case 18:
                ((View) this.A01).setBackgroundResource(0);
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                ReelBrandingBadgeView reelBrandingBadgeView = (ReelBrandingBadgeView) this.A01;
                reelBrandingBadgeView.setIconDrawable((Drawable) null);
                reelBrandingBadgeView.setBorderWidth(0.0f);
                reelBrandingBadgeView.A00 = new int[0];
                return C0eB.A00;
            case 20:
                GradientDrawable gradientDrawable = (GradientDrawable) this.A01;
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setColor(-16777216);
                return C0eB.A00;
            case 22:
                ((SeekBar) this.A01).setOnSeekBarChangeListener(null);
                return C0eB.A00;
            case 23:
                C76223bS c76223bS = (C76223bS) this.A01;
                int A0A = AbstractC25228BEl.A0A(c76223bS, AbstractC77623dm.A0B(c76223bS));
                return new C210339Rw(A0A, A0A, AbstractC77623dm.A03(c76223bS, R.color.audio_bar_action_color_enabled), AbstractC25228BEl.A0A(c76223bS, AbstractC77623dm.A0D(c76223bS, R.dimen.account_recs_header_image_margin)));
            case 24:
                ((ShimmerFrameLayout) this.A01).A04(null);
                return C0eB.A00;
            case 25:
            case 30:
                ((TextView) this.A01).setMovementMethod(null);
                return C0eB.A00;
            case 26:
                ((BulletAwareTextView) this.A01).setSpacingAdd(0);
                return C0eB.A00;
            case 27:
                ((View) this.A01).setPadding(0, 0, 0, 0);
                return C0eB.A00;
            case 28:
                ((View) this.A01).setBackground(null);
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                ((TextView) this.A01).setText((CharSequence) null);
                return C0eB.A00;
            case 31:
                ((IgTextLayoutView) this.A01).A01 = null;
                return C0eB.A00;
            case 32:
                return new C64073Syp(this.A01, 2);
            case 33:
                return AbstractC12220kQ.A02((AbstractC12990ll) this.A01);
            case 34:
                return new RunnableC36840GLn((C33230ElN) this.A01);
            case 35:
                return new RunnableC36841GLo((C33230ElN) this.A01);
            case 36:
                obj2 = this.A01;
                i2 = 46;
                return new EV0(obj2, i2);
            case 37:
                return new C35754Fqr(this.A01, 11);
            case 38:
                obj2 = this.A01;
                i2 = 47;
                return new EV0(obj2, i2);
            case 39:
                return new ViewOnClickListenerC35677FpC(this.A01, 60);
            case 40:
                obj2 = this.A01;
                i2 = 49;
                return new EV0(obj2, i2);
            case Seq.NULL_REFNUM /* 41 */:
                return new Em2(this.A01, 6);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                obj2 = this.A01;
                i2 = 50;
                return new EV0(obj2, i2);
            case 43:
                obj = this.A01;
                i = 0;
                return new C32539EUp(obj, i);
            case 44:
                obj = this.A01;
                i = 1;
                return new C32539EUp(obj, i);
            case 45:
                obj = this.A01;
                i = 2;
                return new C32539EUp(obj, i);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                obj = this.A01;
                i = 3;
                return new C32539EUp(obj, i);
            case 47:
                return new ViewOnClickListenerC35677FpC(this.A01, 61);
            case 48:
                return new C36742GHl((EK3) this.A01);
            case 49:
                obj = this.A01;
                i = 4;
                return new C32539EUp(obj, i);
        }
    }
}
