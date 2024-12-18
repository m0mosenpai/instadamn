package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;
import com.instagram.react.activity.IgReactActivity;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.exceptionmanager.IgReactExceptionManager;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.B5z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25027B5z extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25027B5z(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String A0r;
        String A0k;
        switch (this.A00) {
            case 0:
                return Integer.valueOf((int) (AbstractC13890nF.A01(((Fragment) this.A01).requireContext()) * 0.8f));
            case 1:
                C45510KCz c45510KCz = (C45510KCz) this.A01;
                return new L0L(c45510KCz.requireContext(), c45510KCz);
            case 2:
                C45510KCz c45510KCz2 = (C45510KCz) this.A01;
                return new C215729go(c45510KCz2.requireActivity(), AbstractC166987dD.A0r(c45510KCz2.A0L));
            case 3:
                return new QuickSnapReactionEmitterView(((Fragment) this.A01).requireContext(), null, 0);
            case 4:
            case 21:
            case 26:
                return this.A01;
            case 5:
            case 22:
            case 27:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 6:
            case 23:
            case 28:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 7:
                return new O8R((UserSession) this.A01);
            case 8:
                A6M a6m = (A6M) this.A01;
                if (a6m != null) {
                    AbstractC166987dD.A1X(a6m.A00);
                    break;
                }
                break;
            case 9:
                View view = (View) this.A01;
                C14360o3.A0B(view, 0);
                view.clearAnimation();
                view.setRotation(0.0f);
                ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ROTATION, 0.0f, -5.0f, 0.0f, -5.0f, 0.0f).setDuration(300L).start();
                break;
            case 10:
                IgReactActivity igReactActivity = (IgReactActivity) this.A01;
                AbstractC18680vv abstractC18680vv = igReactActivity.A00;
                C14360o3.A0C(abstractC18680vv, AbstractC111324zv.A00(6));
                return new C59802oN((UserSession) abstractC18680vv, igReactActivity);
            case 11:
                return new IgReactExceptionManager((AbstractC18680vv) this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return C006802i.A0p;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return AbstractC166997dE.A0c(C06090Tz.A05, (AbstractC12990ll) this.A01, 36317753831724581L);
            case 14:
                return AbstractC166997dE.A0c(C06090Tz.A05, (AbstractC12990ll) this.A01, 2342160763043780114L);
            case Process.SIGTERM /* 15 */:
                return AbstractC61662rT.A00((UserSession) this.A01);
            case 16:
                C006802i c006802i = C006802i.A0p;
                C14360o3.A07(c006802i);
                return new C31429DrZ(c006802i);
            case 17:
                return new C6dP((UserSession) this.A01);
            case 18:
                return new OMa((UserSession) this.A01);
            case Process.SIGSTOP /* 19 */:
                return new FLB((UserSession) this.A01);
            case 20:
                return new C54765OIa((UserSession) this.A01);
            case 24:
                return new NBD(AbstractC166987dD.A0r(((EMM) this.A01).A0F));
            case 25:
                return ((Fragment) this.A01).requireActivity().getViewModelStore();
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new C215649gg(AbstractC166987dD.A0r(((KA3) this.A01).A0P));
            case 30:
                return new C146116i9(AbstractC166987dD.A0r(((KA3) this.A01).A0P));
            case 31:
                C202498xT c202498xT = (C202498xT) this.A01;
                Context context = c202498xT.A07;
                C216229hf c216229hf = new C216229hf(context);
                int A01 = AbstractC166997dE.A01(context);
                c216229hf.A0B(A01);
                float f = c202498xT.A04;
                float[] fArr = {f, f, f, f};
                AbstractC167017dG.A1X(fArr, 0.0f);
                c216229hf.A0A.setCornerRadii(fArr);
                c216229hf.A03 = c202498xT.A06;
                c216229hf.A09(A01);
                int i = c202498xT.A00;
                c216229hf.A0A(i);
                ImageUrl imageUrl = c202498xT.A08.A01;
                if (imageUrl != null) {
                    c216229hf.A0B.A00(imageUrl);
                } else {
                    Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.profile_anonymous_user);
                    C14360o3.A0A(decodeResource);
                    c216229hf.A0C(new C73053Pg(decodeResource, false));
                }
                Drawable drawable = context.getDrawable(R.drawable.challenge_sticker_trophy_drawable);
                Drawable drawable2 = context.getDrawable(R.drawable.circle_outline_white_2);
                if (drawable != null) {
                    c216229hf.A0D(drawable, drawable2, i);
                    return c216229hf;
                }
                throw AbstractC166997dE.A0g();
            case 32:
                Drawable drawable3 = ((C202498xT) this.A01).A07.getDrawable(R.drawable.interactive_sticker_background);
                if (drawable3 != null) {
                    return drawable3;
                }
                throw AbstractC166997dE.A0g();
            case 33:
                return new C124385ju(((C202498xT) this.A01).A07, r0.A01, R.color.chat_sticker_chat_bubble_color, 1);
            case 34:
                C202498xT c202498xT2 = (C202498xT) this.A01;
                C6RB A0z = AbstractC166987dD.A0z(c202498xT2.A07, c202498xT2.A03);
                A0z.A0b.setFakeBoldText(true);
                A0z.A0A(c202498xT2.A02);
                Context context2 = A0z.A0Z;
                boolean z = c202498xT2.A0F;
                int i2 = R.color.default_cta_dominant_color;
                if (z) {
                    i2 = R.color.clips_remix_camera_outer_container_default_background;
                }
                AbstractC166997dE.A1A(context2, A0z, i2);
                AbstractC166997dE.A1Q(A0z, context2.getResources().getString(2131954981));
                return A0z;
            case 35:
                C202498xT c202498xT3 = (C202498xT) this.A01;
                Context context3 = c202498xT3.A07;
                int i3 = c202498xT3.A06;
                String str = c202498xT3.A08.A00.A05;
                if (str == null) {
                    str = "";
                }
                return new C50744May(context3, i3, 0, str);
            case 36:
                C202498xT c202498xT4 = (C202498xT) this.A01;
                Al9 al9 = c202498xT4.A08;
                if (al9.A09 == null) {
                    C6RB A0z2 = AbstractC166987dD.A0z(c202498xT4.A07, c202498xT4.A03);
                    Context context4 = A0z2.A0Z;
                    AbstractC166997dE.A1A(context4, A0z2, R.color.challenge_sticker_subtitle_text_color);
                    A0z2.A0A(c202498xT4.A05);
                    String str2 = al9.A04;
                    Resources resources = context4.getResources();
                    if (str2 == null) {
                        A0r = resources.getString(2131954983);
                    } else {
                        A0r = AbstractC166997dE.A0r(resources, str2, 2131954982);
                    }
                    AbstractC166997dE.A1Q(A0z2, A0r);
                    return A0z2;
                }
                return null;
            case 37:
                C202508xU c202508xU = (C202508xU) this.A01;
                C44376JjF c44376JjF = new C44376JjF(c202508xU.A00, 0.5f, 0.6f, AbstractC167017dG.A0B(r8), 0.2f, 0.2f, 0, 0, 0, true, false);
                c44376JjF.A02(c202508xU.A02, c202508xU.A03);
                return c44376JjF;
            case 38:
                C202518xV c202518xV = (C202518xV) this.A01;
                List A0d = AbstractC001800i.A0d(c202518xV.A08, 3);
                ArrayList A0q = AbstractC167017dG.A0q(A0d);
                Iterator it = A0d.iterator();
                while (it.hasNext()) {
                    A0q.add(new C89533yt((ImageUrl) it.next(), c202518xV.A07, c202518xV.A00, c202518xV.A01, 0, AbstractC166997dE.A01(c202518xV.A05)));
                }
                return A0q;
            case 39:
                C202518xV c202518xV2 = (C202518xV) this.A01;
                if (c202518xV2.A0C) {
                    return c202518xV2.A05.getDrawable(R.drawable.interactive_sticker_background);
                }
                return null;
            case 40:
                C202518xV c202518xV3 = (C202518xV) this.A01;
                C6RB A0z3 = AbstractC166987dD.A0z(c202518xV3.A05, c202518xV3.A02);
                Context context5 = A0z3.A0Z;
                boolean z2 = c202518xV3.A0C;
                int i4 = R.color.audio_bar_action_color_enabled;
                if (z2) {
                    i4 = R.color.clips_remix_camera_outer_container_default_background;
                }
                AbstractC166997dE.A1A(context5, A0z3, i4);
                A0z3.A0A(c202518xV3.A03);
                Resources resources2 = context5.getResources();
                if (z2) {
                    A0k = AbstractC166997dE.A0r(resources2, Integer.valueOf(c202518xV3.A04), 2131954984);
                } else {
                    A0k = AbstractC167017dG.A0k(resources2, c202518xV3.A04, R.plurals.challenges_story_winners_facepile_text);
                }
                AbstractC166997dE.A1Q(A0z3, A0k);
                return A0z3;
            case Seq.NULL_REFNUM /* 41 */:
                return Integer.valueOf(AbstractC167017dG.A03((Context) this.A01));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 44:
                return Integer.valueOf(AbstractC167017dG.A0E((Context) this.A01));
            case 43:
                return Integer.valueOf(((Context) this.A01).getResources().getDimensionPixelSize(R.dimen.challenge_sticker_v2_facepile_text_size));
            case 45:
                return Float.valueOf(AbstractC167017dG.A0G((Context) this.A01));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                Paint A0P = AbstractC166997dE.A0P();
                AbstractC166987dD.A1N((Context) this.A01, A0P, R.color.chat_sticker_chat_bubble_color);
                return A0P;
            case 47:
                ((C24006Akk) ((InterfaceC57846PlC) this.A01)).A00.invoke();
                break;
            case 48:
                C148456mF A00 = C148446mE.A00((C148446mE) this.A01);
                C148456mF.A01(C56526P7y.A00, A00);
                ((C141806ax) A00.A0A.getValue()).A01();
                break;
            case 49:
                C148456mF.A03(C148446mE.A00((C148446mE) this.A01));
                break;
        }
        return C0eB.A00;
    }
}
