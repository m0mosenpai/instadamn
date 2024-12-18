package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Base64;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.7Hs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160587Hs {
    public int A00;
    public ViewGroup A01;
    public IgImageView A02;
    public boolean A03;
    public boolean A04;
    public final Activity A05;
    public final LruCache A06;
    public final ViewStub A07;
    public final UserSession A08;
    public final String A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public volatile String A0K;

    public C160587Hs(Activity activity, ViewStub viewStub, UserSession userSession) {
        C14360o3.A0B(viewStub, 3);
        this.A08 = userSession;
        this.A05 = activity;
        this.A07 = viewStub;
        this.A0B = AbstractC09440dt.A01(new MHI(this, 17));
        this.A0C = AbstractC09440dt.A01(new MHI(this, 18));
        this.A0D = AbstractC09440dt.A01(new MHI(this, 19));
        this.A0H = AbstractC09440dt.A01(B75.A00);
        this.A09 = C18U.A04(C06090Tz.A06, userSession, 36887717464376084L);
        this.A0A = AbstractC09440dt.A01(new MHI(this, 16));
        this.A0I = AbstractC09440dt.A01(new MHI(this, 23));
        this.A0E = AbstractC09440dt.A01(new MHI(this, 20));
        this.A0F = AbstractC09440dt.A01(new MHI(this, 21));
        this.A0J = AbstractC09440dt.A01(new MHI(this, 24));
        this.A0G = AbstractC09440dt.A01(new MHI(this, 22));
        this.A0K = "";
        this.A00 = AbstractC50712Us.A01.A05(Integer.MAX_VALUE);
        this.A06 = new LruCache(20);
    }

    public static final void A02(C160587Hs c160587Hs, DirectThreadKey directThreadKey, String str) {
        try {
            String substring = str.substring(AbstractC001900j.A04(str, ',', 0) + 1);
            C14360o3.A07(substring);
            byte[] decode = Base64.decode(substring, 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            IgImageView igImageView = c160587Hs.A02;
            if (igImageView != null) {
                igImageView.post(new RunnableC49999M5o(decodeByteArray, c160587Hs, directThreadKey));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0178, code lost:
    
        if (((java.lang.Boolean) r6.A0C.getValue()).booleanValue() != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A03(com.instagram.model.direct.DirectThreadKey r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160587Hs.A03(com.instagram.model.direct.DirectThreadKey, java.lang.String):java.lang.String");
    }

    public static final void A00(C160587Hs c160587Hs) {
        IgImageView igImageView;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (Build.VERSION.SDK_INT >= 31) {
            IgImageView igImageView2 = c160587Hs.A02;
            if (igImageView2 != null) {
                igImageView2.post(new RunnableC49881M1a(c160587Hs));
                return;
            }
            return;
        }
        if (!c160587Hs.A04 && (igImageView = c160587Hs.A02) != null) {
            Drawable drawable = igImageView.getDrawable();
            if (!(drawable instanceof BitmapDrawable) || (bitmapDrawable = (BitmapDrawable) drawable) == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
                return;
            } else {
                igImageView.setBitmapAndImageRenderer(bitmap, null);
            }
        }
        IgImageView igImageView3 = c160587Hs.A02;
        if (igImageView3 == null) {
            return;
        }
        igImageView3.setImageRendererAndReset(AbstractC158867Ay.A00);
        c160587Hs.A04 = true;
    }

    public static final void A01(C160587Hs c160587Hs) {
        int i = Build.VERSION.SDK_INT;
        IgImageView igImageView = c160587Hs.A02;
        if (i >= 31) {
            if (igImageView != null) {
                igImageView.post(new RunnableC49883M1c(c160587Hs));
            }
        } else {
            if (igImageView != null) {
                igImageView.A09();
            }
            IgImageView igImageView2 = c160587Hs.A02;
            if (igImageView2 != null) {
                igImageView2.setImageRendererAndReset(null);
            }
            c160587Hs.A04 = false;
        }
    }

    public final void A04() {
        ViewGroup viewGroup = this.A01;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        View findViewById = this.A05.findViewById(R.id.message_list_refresh_container);
        if (findViewById != null) {
            findViewById.animate().alpha(1.0f).start();
        }
    }
}
