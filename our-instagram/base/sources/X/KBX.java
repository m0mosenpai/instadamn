package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.litho.LithoView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KBX extends AbstractC59962oe {
    public static final List A0I = AbstractC16960so.A1Q("❤️", "🙌", "🔥", "👏", "😢", "😍", "😮", "😂");
    public static final String __redex_internal_original_name = "DirectReplyComposerFragment";
    public int A00;
    public View A01;
    public IgTextView A02;
    public IgTextView A03;
    public C7IK A04;
    public C47623L1i A05;
    public ComposerAutoCompleteTextView A06;
    public Map A08;
    public View A09;
    public RecyclerView A0A;
    public LithoView A0B;
    public IgTextView A0C;
    public IgImageView A0D;
    public IgImageView A0E;
    public IgImageView A0F;
    public String A07 = "";
    public final LO2 A0G = new LO2(this, 11);
    public final InterfaceC09390do A0H = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_reply_composer_fragment";
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f1  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KBX.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(KBX kbx, boolean z) {
        IgTextView igTextView = kbx.A0C;
        if (z) {
            if (igTextView != null) {
                igTextView.setVisibility(0);
                IgImageView igImageView = kbx.A0E;
                if (igImageView != null) {
                    igImageView.setVisibility(8);
                    IgImageView igImageView2 = kbx.A0D;
                    if (igImageView2 != null) {
                        igImageView2.setVisibility(8);
                        IgImageView igImageView3 = kbx.A0F;
                        if (igImageView3 != null) {
                            igImageView3.setVisibility(8);
                            return;
                        }
                        C14360o3.A0F("voice");
                    }
                    C14360o3.A0F("gallery");
                }
                C14360o3.A0F("savedReply");
            }
            C14360o3.A0F("sendButton");
        } else {
            if (igTextView != null) {
                igTextView.setVisibility(8);
                IgImageView igImageView4 = kbx.A0D;
                if (igImageView4 != null) {
                    igImageView4.setVisibility(0);
                    IgImageView igImageView5 = kbx.A0F;
                    if (igImageView5 != null) {
                        igImageView5.setVisibility(0);
                        if (!C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(kbx.A0H, 0), 36316289244926176L)) {
                            return;
                        }
                        IgImageView igImageView6 = kbx.A0E;
                        if (igImageView6 != null) {
                            igImageView6.setVisibility(0);
                            return;
                        }
                        C14360o3.A0F("savedReply");
                    }
                    C14360o3.A0F("voice");
                }
                C14360o3.A0F("gallery");
            }
            C14360o3.A0F("sendButton");
        }
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0H);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1732961807);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_reply_composer, viewGroup, false);
        this.A09 = inflate;
        if (inflate == null) {
            C14360o3.A0F("rootView");
            throw C00O.createAndThrow();
        }
        C0f9.A09(-1565206199, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1410852999);
        super.onDestroy();
        C47623L1i c47623L1i = this.A05;
        if (c47623L1i != null) {
            C44137Jf2 c44137Jf2 = c47623L1i.A00;
            C7GN c7gn = c44137Jf2.A01;
            if (c7gn != null) {
                c7gn.A0E();
            }
            c44137Jf2.A01 = null;
        }
        C0f9.A09(-415952847, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1953282165);
        super.onDestroyView();
        this.A03 = null;
        this.A0A = null;
        this.A0B = null;
        C0f9.A09(917283291, A02);
    }
}
