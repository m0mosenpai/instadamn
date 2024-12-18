package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode;
import com.instagram.model.effect.AREffect;
import com.instagram.model.shopping.ProductAREffectContainer;
import java.util.List;

/* renamed from: X.MjH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51173MjH extends C2UU {
    public static final String[] A0V = {"VIEW_PRODUCT", "SAVE_TO_WISHLIST", "SEND_PRODUCT_TO"};
    public static final String[] A0W = {"TRY_IT", "VIEW_PRODUCT", "SEND_PRODUCT_TO"};
    public C54823OLg A00;
    public C55907Ory A01;
    public C55907Ory A02;
    public java.util.Set A03;
    public boolean A04;
    public java.util.Set A05;
    public final int A06;
    public final Context A07;
    public final EffectAttribution A08;
    public final UserSession A09;
    public final ImageUrl A0A;
    public final EffectInfoBottomSheetMode A0B;
    public final EnumC138476Pd A0C;
    public final EnumC223179sw A0D;
    public final AREffect A0E;
    public final ProductAREffectContainer A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final List A0P;
    public final List A0Q;
    public final List A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;

    private OFM A00(C3PD c3pd, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, boolean z) {
        Context context = this.A07;
        String str2 = this.A0L;
        Drawable drawable = null;
        boolean z2 = false;
        boolean A1U = AbstractC167007dF.A1U(str2);
        boolean z3 = true;
        if (bool2 != null) {
            z3 = bool2.booleanValue();
        }
        if (bool3 != null) {
            A1U = bool3.booleanValue();
        }
        if (!z && num != null) {
            drawable = MSX.A07(context, num);
        }
        if (bool != null) {
            z2 = bool.booleanValue();
        }
        if (bool3 != null) {
            A1U = bool3.booleanValue();
        }
        return new OFM(null, drawable, null, c3pd, str, str2, 1.0f, z2, z3, A1U);
    }

    private OFM A01(C3PD c3pd, Integer num, String str, boolean z) {
        return A00(c3pd, Boolean.FALSE, null, null, num, str, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
    
        if (r2 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0263, code lost:
    
        if (r30.A0B == com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.SHOPPING_TEST) goto L63;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0040. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r31, int r32) {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51173MjH.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewRecycled(C3OO c3oo) {
        AbstractC51363MmO abstractC51363MmO = (AbstractC51363MmO) c3oo;
        if (abstractC51363MmO instanceof NXT) {
            NXT nxt = (NXT) abstractC51363MmO;
            AbstractC31177DnL.A0z(nxt.A01(), nxt.A00.getContext());
            nxt.A00().setImageResource(R.color.fds_transparent);
        } else {
            NXU nxu = (NXU) abstractC51363MmO;
            nxu.A02.setTextColor(-16777216);
            ImageView imageView = nxu.A01;
            imageView.setImageResource(R.color.fds_transparent);
            AbstractC31173DnH.A0z(imageView.getContext(), imageView, R.drawable.action_button_ring);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ad, code lost:
    
        if (r4 == com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.SHOPPING_TEST) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51173MjH(android.content.Context r16, com.instagram.common.session.UserSession r17, com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration r18, java.lang.String r19, java.util.List r20, java.util.List r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51173MjH.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration, java.lang.String, java.util.List, java.util.List, int, boolean):void");
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-545258054);
        int size = this.A0R.size();
        C0f9.A0A(1714305876, A03);
        return size;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new NXT(AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.effect_bottomsheet_action_button_row));
    }
}
