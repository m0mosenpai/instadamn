package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.gallery.GalleryView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class KCT extends AbstractC59962oe implements InterfaceC60072op, InterfaceC50436MOq, InterfaceC50495MQy, MQG {
    public static final String __redex_internal_original_name = "DirectMediaPickerPhotosFragment";
    public MRF A00;
    public C47322KvX A01;
    public C47958LGu A02;
    public MR9 A03;
    public MPG A04;
    public String A05;
    public boolean A06;
    public float A07;
    public int A08;
    public int A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public IgSimpleImageView A0D;
    public IgSimpleImageView A0E;
    public L5G A0F;
    public C7IK A0G;
    public GalleryView A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final InterfaceC09390do A0O = AbstractC60492pY.A02(this);
    public final String A0P = "direct_media_picker_photos_fragment";

    public final void A01(InterfaceC30956DjD interfaceC30956DjD, List list) {
        C47958LGu c47958LGu = this.A02;
        if (c47958LGu == null) {
            C14360o3.A0F("mediaPickerPhotosController");
            throw C00O.createAndThrow();
        }
        Resources A09 = AbstractC31177DnL.A09(this);
        Context context = c47958LGu.A04;
        UserSession userSession = c47958LGu.A05;
        C195398kf c195398kf = c47958LGu.A06;
        C14360o3.A0B(c195398kf, 2);
        c195398kf.A04(LIH.A00(list), new C29722D8s(8, this, list, context, A09, interfaceC30956DjD, userSession));
    }

    @Override // X.InterfaceC50495MQy
    public final boolean DmO(Medium medium, String str) {
        C14360o3.A0B(str, 0);
        MRF mrf = this.A00;
        if (mrf != null) {
            return mrf.DmO(medium, str);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0070, code lost:
    
        if (r40.A0M == false) goto L12;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r41, android.os.Bundle r42) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KCT.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final List A00() {
        C47958LGu c47958LGu = this.A02;
        if (c47958LGu == null) {
            C14360o3.A0F("mediaPickerPhotosController");
            throw C00O.createAndThrow();
        }
        return c47958LGu.A01();
    }

    public final boolean A02() {
        String str;
        C47958LGu c47958LGu = this.A02;
        if (c47958LGu == null) {
            str = "mediaPickerPhotosController";
        } else {
            GalleryView galleryView = c47958LGu.A03;
            if (galleryView == null) {
                str = "galleryView";
            } else {
                return AbstractC167007dF.A1O(galleryView.A02);
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC50436MOq
    public final void ADq(C7IK c7ik) {
        View view;
        this.A0G = c7ik;
        if (this.mView != null && c7ik != null) {
            TextView textView = this.A0C;
            if (textView != null) {
                textView.setTextColor(c7ik.A0C);
            }
            TextView textView2 = this.A0B;
            if (textView2 != null) {
                textView2.setTextColor(c7ik.A0D);
            }
            IgSimpleImageView igSimpleImageView = this.A0E;
            if (igSimpleImageView != null) {
                igSimpleImageView.setColorFilter(c7ik.A0C);
            }
            IgSimpleImageView igSimpleImageView2 = this.A0D;
            if (igSimpleImageView2 != null) {
                igSimpleImageView2.setColorFilter(c7ik.A0C);
            }
            GalleryView galleryView = this.A0H;
            if (galleryView != null && (view = galleryView.A0W.getView()) != null) {
                view.setBackgroundColor(c7ik.A09);
                TextView A0T = AbstractC166997dE.A0T(view, R.id.inline_gallery_empty_title);
                int i = c7ik.A0C;
                A0T.setTextColor(i);
                AbstractC166997dE.A0T(view, R.id.inline_gallery_empty_message).setTextColor(i);
            }
        }
    }

    @Override // X.MQG
    public final boolean CQn() {
        boolean z;
        String str;
        C47958LGu c47958LGu = this.A02;
        if (c47958LGu == null) {
            str = "mediaPickerPhotosController";
        } else {
            GalleryView galleryView = c47958LGu.A03;
            if (galleryView == null) {
                str = "galleryView";
            } else {
                ViewOnTouchListenerC195698lA viewOnTouchListenerC195698lA = galleryView.A0B;
                if (viewOnTouchListenerC195698lA != null) {
                    z = viewOnTouchListenerC195698lA.A04;
                } else {
                    z = false;
                }
                return !z;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC50495MQy
    public final void D2F() {
        MRF mrf = this.A00;
        if (mrf != null) {
            mrf.D2F();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC50495MQy
    public final boolean DIy(View view, GalleryItem galleryItem) {
        MRF mrf = this.A00;
        if (mrf != null) {
            return mrf.DIy(view, galleryItem);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC50495MQy
    public final void DKF(boolean z) {
        MRF mrf = this.A00;
        if (mrf != null) {
            mrf.DKF(z);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0P;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0O);
    }

    @Override // X.MQG
    public final boolean isScrolledToTop() {
        C47958LGu c47958LGu = this.A02;
        if (c47958LGu == null) {
            C14360o3.A0F("mediaPickerPhotosController");
            throw C00O.createAndThrow();
        }
        return c47958LGu.A05();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C47958LGu c47958LGu = this.A02;
        if (c47958LGu == null) {
            C14360o3.A0F("mediaPickerPhotosController");
            throw C00O.createAndThrow();
        }
        return c47958LGu.A06();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1350265760);
        super.onCreate(bundle);
        this.A0J = requireArguments().getBoolean("BUNDLE_IS_EMBEDDED");
        this.A08 = requireArguments().getInt("MAX_MULTI_SELECT_COUNT");
        this.A09 = requireArguments().getInt("MAX_MULTI_VIDEO_COUNT");
        this.A0I = requireArguments().getBoolean("BUNDLE_IS_CAPTURE_BUTTON_ENABLED");
        this.A05 = requireArguments().getString("BUNDLE_THREAD_TRANSPORT_TYPE");
        this.A0N = requireArguments().getBoolean("BUNDLE_SHOW_SELECT_BUTTON");
        this.A07 = requireArguments().getFloat("BUNDLE_ASPECT_RATIO", 1.0f);
        this.A0L = requireArguments().getBoolean("BUNDLE_KEEP_FOLDER_SELECTION");
        this.A0M = requireArguments().getBoolean("BUNDLE_SHOW_MAGIC_MEDIA_REMIX");
        this.A0K = new C60352pJ(AbstractC166987dD.A0r(this.A0O)).A00();
        C0f9.A09(-901229840, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(800567958);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_media_picker_photos, viewGroup, false);
        C0f9.A09(-192451121, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(2065386865);
        super.onDestroy();
        InterfaceC09390do interfaceC09390do = this.A0O;
        LI5 A00 = AbstractC46750Km7.A00(AbstractC166987dD.A0r(interfaceC09390do));
        LI5.A01(A00, new C37014GSt(A00, 37));
        if (this.A06) {
            C49632Pw A002 = AbstractC49622Pv.A00(AbstractC166987dD.A0r(interfaceC09390do));
            A002.A00 = A002.A04.A06(CancelReason.USER_CANCELLED, "User exited the flow before the gallery was fully loaded", 17642674, A002.A00);
            this.A06 = false;
        }
        C0f9.A09(1856027878, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(-1300573875);
        super.onDestroyView();
        C47958LGu c47958LGu = this.A02;
        if (c47958LGu == null) {
            str = "mediaPickerPhotosController";
        } else {
            GalleryView galleryView = c47958LGu.A03;
            if (galleryView == null) {
                str = "galleryView";
            } else {
                C44420JkF c44420JkF = galleryView.A0C;
                if (c44420JkF != null) {
                    java.util.Set set = c44420JkF.A06;
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        View A09 = AbstractC43592JPx.A09(it);
                        C57112jm A00 = AbstractC58982mw.A00(A09);
                        if (A00 != null) {
                            A00.A04(A09);
                        }
                    }
                    set.clear();
                }
                this.A0C = null;
                this.A0B = null;
                this.A0E = null;
                this.A0D = null;
                this.A0H = null;
                C0f9.A09(1099232435, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(314056808);
        super.onPause();
        C47958LGu c47958LGu = this.A02;
        if (c47958LGu == null) {
            C14360o3.A0F("mediaPickerPhotosController");
            throw C00O.createAndThrow();
        }
        c47958LGu.A02();
        C0f9.A09(805478493, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(913303640);
        super.onResume();
        C47958LGu c47958LGu = this.A02;
        if (c47958LGu == null) {
            C14360o3.A0F("mediaPickerPhotosController");
            throw C00O.createAndThrow();
        }
        c47958LGu.A03();
        C0f9.A09(421014125, A02);
    }
}
