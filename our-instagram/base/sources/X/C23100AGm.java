package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.instagram.arcommerce.view.IgCommerceCameraToggleButton;
import org.json.JSONObject;

/* renamed from: X.AGm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23100AGm {
    public Integer A00;
    public final BBL A01;
    public final C22830A4z A02;

    public C23100AGm(BBL bbl, C22830A4z c22830A4z, C214619ez c214619ez, Integer num) {
        C14360o3.A0B(bbl, 1);
        this.A01 = bbl;
        this.A02 = c22830A4z;
        this.A00 = C05F.A01;
        bbl.setOnClick(new ViewOnClickListenerC23249ASk(this, 0));
        Context requireContext = c214619ez.requireContext();
        XNQ xnq = XNQ.A1j;
        BSU bsu = BSU.FILLED;
        BSV bsv = BSV.SIZE_16;
        Drawable A00 = AbstractC65877Tvg.A00(requireContext, xnq, bsv, bsu);
        C14360o3.A07(A00);
        Drawable A002 = AbstractC65877Tvg.A00(c214619ez.requireContext(), XNQ.A0s, bsv, bsu);
        C14360o3.A07(A002);
        IgCommerceCameraToggleButton igCommerceCameraToggleButton = (IgCommerceCameraToggleButton) bbl;
        igCommerceCameraToggleButton.A00 = A00;
        igCommerceCameraToggleButton.A01 = A002;
        ImageView imageView = igCommerceCameraToggleButton.A03;
        if (imageView != null) {
            imageView.setImageDrawable(A002);
        }
        A00(this, num);
    }

    public static final void A00(C23100AGm c23100AGm, Integer num) {
        View view;
        Context context;
        int i;
        if (num != c23100AGm.A00) {
            Integer num2 = C05F.A01;
            IgCommerceCameraToggleButton igCommerceCameraToggleButton = (IgCommerceCameraToggleButton) c23100AGm.A01;
            ImageView imageView = igCommerceCameraToggleButton.A03;
            if (num == num2) {
                if (imageView != null) {
                    imageView.setImageDrawable(igCommerceCameraToggleButton.A01);
                }
                view = igCommerceCameraToggleButton.A02;
                if (view != null) {
                    context = view.getContext();
                    i = R.anim.toggle_slide_left;
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
                    loadAnimation.setFillAfter(true);
                    view.startAnimation(loadAnimation);
                }
                c23100AGm.A00 = num;
            }
            if (imageView != null) {
                imageView.setImageDrawable(igCommerceCameraToggleButton.A00);
            }
            view = igCommerceCameraToggleButton.A02;
            if (view != null) {
                context = view.getContext();
                i = R.anim.toggle_slide_right;
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                loadAnimation2.setFillAfter(true);
                view.startAnimation(loadAnimation2);
            }
            c23100AGm.A00 = num;
        }
    }

    public final void A01() {
        Integer num = C05F.A01;
        A00(this, num);
        C214619ez c214619ez = this.A02.A00;
        c214619ez.A0B.A00();
        if (c214619ez.A04() != num) {
            AAB A01 = c214619ez.A01();
            AKN akn = A01.A03;
            if (akn.A00 != 0) {
                AKN.A01(akn);
                C23432Aa5 c23432Aa5 = akn.A09;
                c23432Aa5.A05(akn.A0C);
                C23432Aa5.A00(c23432Aa5).enable(false);
                akn.A00 = 0;
            }
            C22990ABp c22990ABp = A01.A06;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "onAR3DToggleSwitchStateChanged");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("newValue", "3D");
            jSONObject.put("data", jSONObject2);
            c22990ABp.A00(jSONObject);
            C14360o3.A0B(num, 0);
            c214619ez.A0F = num;
        }
    }
}
