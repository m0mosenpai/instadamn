package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.Jje, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44401Jje extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ImageView A01;
    public final /* synthetic */ C44662Jq7 A02;
    public final /* synthetic */ C45056Jwl A03;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C44401Jje(ImageView imageView, C44662Jq7 c44662Jq7, C45056Jwl c45056Jwl, int i) {
        this.A02 = c44662Jq7;
        this.A00 = i;
        this.A03 = c45056Jwl;
        this.A01 = imageView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ImageView imageView = this.A01;
        Bitmap A0F = AbstractC167007dF.A0F(imageView.getWidth(), imageView.getHeight());
        imageView.draw(AbstractC43592JPx.A06(A0F));
        C44662Jq7 c44662Jq7 = this.A02;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        GiphyClipsBrowserFragment giphyClipsBrowserFragment = c44662Jq7.A01;
        C45056Jwl c45056Jwl = this.A03;
        int i2 = this.A00;
        EnumC50631MWs enumC50631MWs = giphyClipsBrowserFragment.A00;
        String str = "giphyBrowserViewModel";
        if (enumC50631MWs != null) {
            C22C A0T = AbstractC43593JPy.A0T(giphyClipsBrowserFragment.A09);
            C44549Jmt c44549Jmt = giphyClipsBrowserFragment.A03;
            if (c44549Jmt != null) {
                String str2 = ((JWd) c44549Jmt.A09.getValue()).A01;
                String str3 = c45056Jwl.A05;
                C448124l c448124l = A0T.A09;
                AbstractC25230BEn.A15(1, str2, str3);
                C25531Mh A08 = C25531Mh.A08(c448124l.A01);
                if (AbstractC25226BEj.A1Z(A08)) {
                    A08.A0s("IG_CAMERA_ENTITY_TAP");
                    C22M A0O = JQ0.A0O(enumC50631MWs, A08, c448124l, "THIRD_PARTY_CLIP_HUB_LONG_PRESS_PREVIEW");
                    A08.A0R("gif_category", str2);
                    A08.A0R("gif_id", str3);
                    A08.A0Q("gif_index", AbstractC31171DnF.A0V(i2));
                    A08.A0R("composition_str_id", A0O.A0M);
                    AbstractC167017dG.A1D(A08);
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        ViewOnTouchListenerC48086LQl viewOnTouchListenerC48086LQl = giphyClipsBrowserFragment.A04;
        if (viewOnTouchListenerC48086LQl == null) {
            str = "peekController";
        } else {
            String str4 = c45056Jwl.A05;
            C47712L4t c47712L4t = c45056Jwl.A01;
            float f = c47712L4t.A01;
            float f2 = c47712L4t.A00;
            C14360o3.A0B(str4, 1);
            C55982hj c55982hj = viewOnTouchListenerC48086LQl.A0G;
            if (c55982hj.A0C()) {
                viewOnTouchListenerC48086LQl.A06 = str4;
                viewOnTouchListenerC48086LQl.A08 = true;
                ViewGroup viewGroup = viewOnTouchListenerC48086LQl.A0D;
                Activity activity = viewOnTouchListenerC48086LQl.A0B;
                ViewGroup viewGroup2 = viewOnTouchListenerC48086LQl.A0E;
                viewGroup.setBackgroundDrawable(AbstractC669130i.A00(activity, viewGroup2));
                viewOnTouchListenerC48086LQl.A04 = imageView;
                Rect rect = viewOnTouchListenerC48086LQl.A0C;
                imageView.getDrawingRect(rect);
                try {
                    viewGroup2.offsetDescendantRectToMyCoords(viewOnTouchListenerC48086LQl.A04, rect);
                    float f3 = f / f2;
                    float A082 = AbstractC166987dD.A08(viewGroup) * 0.75f;
                    float width = viewGroup2.getWidth() - (viewOnTouchListenerC48086LQl.A0A * 2);
                    int width2 = imageView.getWidth();
                    viewOnTouchListenerC48086LQl.A03 = width2;
                    viewOnTouchListenerC48086LQl.A02 = C1H4.A01(width2 / f3);
                    int A01 = C1H4.A01(Math.min(width / f3, A082));
                    viewOnTouchListenerC48086LQl.A00 = A01;
                    viewOnTouchListenerC48086LQl.A01 = AbstractC166987dD.A0B(A01, f3);
                    c55982hj.A03();
                    InterfaceC56002hn interfaceC56002hn = viewOnTouchListenerC48086LQl.A05;
                    if (interfaceC56002hn == null) {
                        interfaceC56002hn = C71Q.A00(imageView);
                        viewOnTouchListenerC48086LQl.A05 = interfaceC56002hn;
                    }
                    if (interfaceC56002hn != null) {
                        interfaceC56002hn.COs(viewOnTouchListenerC48086LQl);
                        interfaceC56002hn.setFocusable(true);
                    }
                    ImageView imageView2 = viewOnTouchListenerC48086LQl.A0F;
                    imageView2.setImageBitmap(A0F);
                    imageView2.setVisibility(0);
                    viewOnTouchListenerC48086LQl.A0I.setVisibility(0);
                } catch (IllegalArgumentException unused) {
                    viewOnTouchListenerC48086LQl.A00();
                }
            }
            C44549Jmt c44549Jmt2 = giphyClipsBrowserFragment.A03;
            if (c44549Jmt2 != null) {
                c44549Jmt2.A03(giphyClipsBrowserFragment.requireContext(), AbstractC166987dD.A0r(giphyClipsBrowserFragment.A09), c45056Jwl, new BAO(48, c45056Jwl, giphyClipsBrowserFragment));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        View view;
        int A04;
        C44662Jq7 c44662Jq7 = this.A02;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        GiphyClipsBrowserFragment giphyClipsBrowserFragment = c44662Jq7.A01;
        int i2 = this.A00;
        C45056Jwl c45056Jwl = this.A03;
        RecyclerView recyclerView = giphyClipsBrowserFragment.giphyClipsRecyclerView;
        Integer num = null;
        if (recyclerView != null) {
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            if ((abstractC70663Fe instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) abstractC70663Fe) != null) {
                int[] iArr = new int[staggeredGridLayoutManager.A06];
                for (int i3 = 0; i3 < staggeredGridLayoutManager.A06; i3++) {
                    C9GM c9gm = staggeredGridLayoutManager.A0H[i3];
                    boolean z = c9gm.A05.A0D;
                    int size = c9gm.A03.size();
                    if (z) {
                        A04 = c9gm.A04(size - 1, -1);
                    } else {
                        A04 = c9gm.A04(0, size);
                    }
                    iArr[i3] = A04;
                }
                C14360o3.A0A(iArr);
                int length = iArr.length;
                if (length != 0) {
                    int i4 = iArr[0];
                    int i5 = Integer.MAX_VALUE;
                    int[] iArr2 = new int[2];
                    int i6 = 0;
                    do {
                        int i7 = iArr[i6];
                        C3OO A0W = recyclerView.A0W(i7, false);
                        if (A0W != null && (view = A0W.itemView) != null) {
                            view.getLocationOnScreen(iArr2);
                            int i8 = iArr2[0];
                            if (i8 < i5) {
                                i4 = i7;
                                i5 = i8;
                            } else if (i8 == i5) {
                                i4 = Math.min(i4, i7);
                            }
                        }
                        i6++;
                    } while (i6 < length);
                    num = Integer.valueOf(i4);
                }
            }
        }
        giphyClipsBrowserFragment.A05 = num;
        C44549Jmt c44549Jmt = giphyClipsBrowserFragment.A03;
        if (c44549Jmt == null) {
            C14360o3.A0F("giphyBrowserViewModel");
            throw C00O.createAndThrow();
        }
        Context requireContext = giphyClipsBrowserFragment.requireContext();
        UserSession A0r = AbstractC166987dD.A0r(giphyClipsBrowserFragment.A09);
        Integer num2 = giphyClipsBrowserFragment.A06;
        C14360o3.A0B(A0r, 1);
        EnumC50631MWs enumC50631MWs = c44549Jmt.A02;
        if (enumC50631MWs != null) {
            C22C A01 = AnonymousClass229.A01(A0r);
            String str = ((JWd) c44549Jmt.A07.getValue()).A01;
            String str2 = c45056Jwl.A05;
            C448124l c448124l = A01.A09;
            AbstractC25230BEn.A15(1, str, str2);
            C25531Mh A08 = C25531Mh.A08(c448124l.A01);
            if (AbstractC25226BEj.A1Z(A08)) {
                A08.A0s("IG_CAMERA_ENTITY_TAP");
                C22M A0O = JQ0.A0O(enumC50631MWs, A08, c448124l, "THIRD_PARTY_CLIP_HUB_VIDEO_CELL_TAP");
                A08.A0R("gif_category", str);
                A08.A0R("gif_id", str2);
                A08.A0Q("gif_index", AbstractC31171DnF.A0V(i2));
                A08.A0R("composition_str_id", A0O.A0M);
                AbstractC167017dG.A1D(A08);
            }
        }
        c44549Jmt.A01 = true;
        C05A c05a = c44549Jmt.A06;
        Collection collection = (Collection) ((AbstractC193598he) c05a.getValue()).A01;
        if (collection != null) {
            ArrayList A1F = AbstractC166987dD.A1F(collection);
            C45056Jwl c45056Jwl2 = (C45056Jwl) A1F.get(i2);
            Integer num3 = C05F.A0C;
            String str3 = c45056Jwl2.A05;
            String str4 = c45056Jwl2.A07;
            String str5 = c45056Jwl2.A06;
            int i9 = c45056Jwl2.A00;
            C47712L4t c47712L4t = c45056Jwl2.A01;
            C47712L4t c47712L4t2 = c45056Jwl2.A02;
            A91 a91 = c45056Jwl2.A03;
            AbstractC25230BEn.A15(1, str3, str4);
            AbstractC25233BEq.A0x(2, str5, c47712L4t, c47712L4t2);
            C14360o3.A0B(a91, 6);
            A1F.set(i2, new C45056Jwl(c47712L4t, c47712L4t2, a91, num3, str3, str4, str5, i9));
            c05a.Egh(new C8ZT(A1F));
        }
        c44549Jmt.A03(requireContext, A0r, c45056Jwl, new C9GN(i2, 1, requireContext, A0r, c45056Jwl, c44549Jmt, num2));
        return true;
    }
}
