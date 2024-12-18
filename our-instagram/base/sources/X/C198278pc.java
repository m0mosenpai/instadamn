package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.8pc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198278pc {
    public static final C198288pd A0A = new Object();
    public static volatile C198278pc A0B;
    public int A00;
    public int A01;
    public C45123Jxs A02;
    public Medium A03;
    public Boolean A04;
    public String A05;
    public String A06;
    public String A07;
    public HashMap A08;
    public final List A09 = new ArrayList();

    public final Medium A00(Context context, android.net.Uri uri, AbstractC12990ll abstractC12990ll, String str, String str2) {
        String str3;
        String str4;
        String str5;
        boolean z;
        MediaUploadMetadata mediaUploadMetadata;
        Boolean bool;
        String str6 = null;
        if (uri == null || uri == android.net.Uri.EMPTY) {
            return null;
        }
        android.net.Uri A03 = AbstractC08820cl.A03(uri.toString());
        C14360o3.A07(A03);
        C45123Jxs c45123Jxs = this.A02;
        if (c45123Jxs != null) {
            str3 = c45123Jxs.A04;
            str4 = c45123Jxs.A05;
        } else {
            str3 = null;
            str4 = null;
        }
        Medium call = new B1W(context, A03, abstractC12990ll, str, str3, str4, str2).call();
        int i = call.A08;
        if (i != 1 && i != 3) {
            return null;
        }
        C45123Jxs c45123Jxs2 = this.A02;
        if (c45123Jxs2 != null) {
            str5 = c45123Jxs2.A02;
        } else {
            str5 = null;
        }
        call.A0N = str5;
        if (c45123Jxs2 != null && (bool = (Boolean) c45123Jxs2.A00) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        call.A0g = z;
        MediaUploadMetadata mediaUploadMetadata2 = call.A0G;
        if (c45123Jxs2 != null) {
            mediaUploadMetadata = (MediaUploadMetadata) c45123Jxs2.A01;
        } else {
            mediaUploadMetadata = null;
        }
        mediaUploadMetadata2.A00(mediaUploadMetadata);
        MediaUploadMetadata mediaUploadMetadata3 = call.A0G;
        C45123Jxs c45123Jxs3 = this.A02;
        if (c45123Jxs3 != null) {
            str6 = c45123Jxs3.A04;
        }
        mediaUploadMetadata3.A06 = str6;
        return call;
    }

    public final void A01(final Activity activity, final android.net.Uri uri, C45123Jxs c45123Jxs, final AbstractC12990ll abstractC12990ll, final InterfaceC25201BCz interfaceC25201BCz, final Integer num, final String str, String str2, HashMap hashMap, final List list) {
        final int i;
        C14360o3.A0B(abstractC12990ll, 1);
        this.A09.clear();
        this.A03 = null;
        this.A02 = c45123Jxs;
        this.A08 = hashMap;
        this.A05 = str2;
        InterfaceC14020nS A00 = C14120nc.A00();
        switch (num.intValue()) {
            case 1:
                i = 359166618;
                break;
            case 2:
                i = 1921439977;
                break;
            default:
                i = 553124390;
                break;
        }
        A00.ATO(new AbstractRunnableC14200nk(i) { // from class: X.9jT
            /* JADX WARN: Type inference failed for: r2v0, types: [X.0ps, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                String str3;
                String str4;
                ?? obj = new Object();
                try {
                    List<android.net.Uri> list2 = list;
                    if (list2 != null) {
                        for (android.net.Uri uri2 : list2) {
                            C198278pc c198278pc = this;
                            Activity activity2 = activity;
                            AbstractC12990ll abstractC12990ll2 = abstractC12990ll;
                            switch (num.intValue()) {
                                case 1:
                                    str4 = "reels_share_content_";
                                    break;
                                case 2:
                                    str4 = "feed_share_content_";
                                    break;
                                default:
                                    str4 = "story_share_content_";
                                    break;
                            }
                            Medium A002 = c198278pc.A00(activity2, uri2, abstractC12990ll2, str4, str);
                            if (A002 != null) {
                                c198278pc.A09.add(A002);
                            }
                        }
                    }
                    C198278pc c198278pc2 = this;
                    android.net.Uri uri3 = uri;
                    Activity activity3 = activity;
                    AbstractC12990ll abstractC12990ll3 = abstractC12990ll;
                    switch (num.intValue()) {
                        case 1:
                            str3 = "reels_share_content_interactive_";
                            break;
                        case 2:
                            str3 = "feed_share_content_interactive_";
                            break;
                        default:
                            str3 = "story_share_content_interactive_";
                            break;
                    }
                    Medium A003 = c198278pc2.A00(activity3, uri3, abstractC12990ll3, str3, null);
                    c198278pc2.A03 = A003;
                    if (A003 != null) {
                        A003.A0H = new BackgroundGradientColors(c198278pc2.A01, c198278pc2.A00);
                        if (A003.A05()) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(A003.A0X, options);
                            int i2 = options.outWidth;
                            int i3 = options.outHeight;
                            A003.A0B = i2;
                            A003.A04 = i3;
                        }
                    }
                } catch (Exception e) {
                    C0K8.A0F("ExternalShareMediator", "Exception in copyAsset", e);
                    obj.A00 = e;
                }
                activity.runOnUiThread(new RunnableC24812AyY(interfaceC25201BCz, this, obj));
            }
        });
    }
}
