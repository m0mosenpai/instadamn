package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.webkit.URLUtil;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.8Yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC188908Yg implements C1NJ {
    public static final ConcurrentHashMap A05 = new ConcurrentHashMap();
    public final int A00;
    public final int A01;
    public final BitmapFactory.Options A02;
    public final UserSession A03;
    public final C18340vL A04 = new C18340vL(C14120nc.A00(), Runtime.getRuntime().availableProcessors() * 2);

    public AbstractC188908Yg(UserSession userSession, int i, int i2) {
        this.A03 = userSession;
        this.A01 = i;
        this.A00 = i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        this.A02 = options;
    }

    public final void A01(BDL bdl, final Object obj) {
        final String A00;
        StringBuilder sb;
        String str;
        String str2;
        if (this instanceof C188898Yf) {
            C203238yg c203238yg = (C203238yg) obj;
            C14360o3.A0B(c203238yg, 0);
            A00 = c203238yg.A06;
        } else {
            C218169ko c218169ko = (C218169ko) this;
            C9J0 c9j0 = (C9J0) obj;
            C14360o3.A0B(c9j0, 0);
            A00 = AbstractC226819zd.A00(c218169ko.A00, c9j0, c218169ko.A03);
        }
        if (A00 != null) {
            boolean z = false;
            if (A00.length() == 0) {
                z = true;
            }
            if (z) {
                sb = new StringBuilder();
                str = "Thumbnail path is empty in DraftThumbnailLoader#loadThumbnail. source: ";
            } else if (!new File(A00).exists()) {
                sb = new StringBuilder();
                str = "Thumbnail file doesn't exist in DraftThumbnailLoader#loadThumbnail. source: ";
            } else {
                final WeakReference weakReference = new WeakReference(bdl);
                this.A04.ATO(new AbstractRunnableC14200nk() { // from class: X.9jK
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1910247448, 3, false, false);
                    }

                    /* JADX WARN: Type inference failed for: r4v0 */
                    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r4v2 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ?? r4;
                        StringBuilder sb2;
                        String str3;
                        int i;
                        SimpleImageUrl A02;
                        String str4;
                        AbstractC188908Yg abstractC188908Yg = AbstractC188908Yg.this;
                        WeakReference weakReference2 = weakReference;
                        Object obj2 = obj;
                        String str5 = A00;
                        BDL bdl2 = (BDL) weakReference2.get();
                        if (bdl2 != null && bdl2.CXa(obj2)) {
                            boolean z2 = abstractC188908Yg instanceof C218169ko;
                            if (z2) {
                                C218169ko c218169ko2 = (C218169ko) abstractC188908Yg;
                                C9J0 c9j02 = (C9J0) obj2;
                                r4 = 0;
                                C14360o3.A0B(c9j02, 0);
                                sb2 = new StringBuilder();
                                sb2.append(AbstractC226819zd.A00(c218169ko2.A00, c9j02, c218169ko2.A03));
                                sb2.append('?');
                                sb2.append(c218169ko2.A01);
                                sb2.append('x');
                                i = ((AbstractC188908Yg) c218169ko2).A00;
                            } else {
                                C203238yg c203238yg2 = (C203238yg) obj2;
                                r4 = 0;
                                C14360o3.A0B(c203238yg2, 0);
                                sb2 = new StringBuilder();
                                C196948nP A002 = c203238yg2.A00();
                                if (A002 == null || (str3 = A002.A06) == null) {
                                    str3 = "null";
                                }
                                sb2.append(str3);
                                sb2.append('?');
                                sb2.append(abstractC188908Yg.A01);
                                sb2.append('x');
                                i = abstractC188908Yg.A00;
                            }
                            sb2.append(i);
                            String obj3 = sb2.toString();
                            ConcurrentHashMap concurrentHashMap = AbstractC188908Yg.A05;
                            Number number = (Number) concurrentHashMap.get(obj3);
                            if (number == null) {
                                BitmapFactory.Options options = abstractC188908Yg.A02;
                                BitmapFactory.decodeFile(str5, options);
                                int i2 = options.outWidth;
                                int i3 = options.outHeight;
                                int i4 = abstractC188908Yg.A01;
                                int i5 = abstractC188908Yg.A00;
                                int i6 = 1;
                                while (i2 / i6 > i4 && i3 / i6 > i5) {
                                    i6 *= 2;
                                }
                                number = Integer.valueOf(i6);
                                concurrentHashMap.put(obj3, number);
                            }
                            int intValue = number.intValue();
                            C9BW c9bw = new C9BW(obj2, weakReference2);
                            if (URLUtil.isNetworkUrl(str5)) {
                                A02 = new SimpleImageUrl(str5);
                            } else if (abstractC188908Yg instanceof C188898Yf) {
                                C203238yg c203238yg3 = (C203238yg) obj2;
                                C14360o3.A0B(c203238yg3, r4);
                                android.net.Uri build = android.net.Uri.fromFile(new File(str5)).buildUpon().fragment(c203238yg3.A08).build();
                                C14360o3.A07(build);
                                A02 = AbstractC81033jX.A00(build, -1, -1);
                            } else {
                                A02 = AbstractC81033jX.A02(new File(str5), -1, -1);
                            }
                            C25821No A003 = C25821No.A00();
                            if (z2) {
                                str4 = "ClipsDraftThumbnailLoader";
                            } else {
                                str4 = "StoryDraftThumbnailLoader";
                            }
                            C1OG A0J = A003.A0J(A02, str4);
                            A0J.A0I = r4;
                            A0J.A08 = c9bw;
                            A0J.A02(abstractC188908Yg);
                            A0J.A01 = intValue;
                            A0J.A01();
                        }
                    }
                });
                return;
            }
            sb.append(str);
            if (this instanceof C218169ko) {
                str2 = "ClipsDraftThumbnailLoader";
            } else {
                str2 = "StoryDraftThumbnailLoader";
            }
            sb.append(str2);
            AbstractC12120kG.A06("DraftThumbnailLoader", sb.toString(), null);
        }
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        BDL A00;
        String str;
        C14360o3.A0B(interfaceC59502nt, 0);
        C14360o3.A0B(c73033Pe, 1);
        Object C4x = interfaceC59502nt.C4x();
        C14360o3.A0C(C4x, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.drafts.DraftThumbnailLoader.CacheRequestInfo<*>");
        C9BW c9bw = (C9BW) C4x;
        if (((Reference) c9bw.A01).get() != null && (A00 = A00(interfaceC59502nt)) != null) {
            Object obj = c9bw.A00;
            if (obj == null) {
                if (this instanceof C218169ko) {
                    str = "ClipsDraftThumbnailLoader";
                } else {
                    str = "StoryDraftThumbnailLoader";
                }
                AbstractC12120kG.A06("DraftThumbnailLoader", AnonymousClass001.A0R("could not cast draft object in DraftThumbnailLoader#onBitmapLoaded. source: ", str), null);
                return;
            }
            Bitmap bitmap = c73033Pe.A01;
            if (bitmap == null || !A00.CXa(obj)) {
                return;
            }
            A00.Dt3(bitmap, obj);
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        C14360o3.A0B(interfaceC59502nt, 0);
        BDL A00 = A00(interfaceC59502nt);
        if (A00 != null) {
            A00.Dt0(c82183lf);
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r3 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.BDL A00(X.InterfaceC59502nt r5) {
        /*
            r4 = this;
            java.lang.Object r1 = r5.C4x()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.drafts.DraftThumbnailLoader.CacheRequestInfo<*>"
            X.C14360o3.A0C(r1, r0)
            X.9BW r1 = (X.C9BW) r1
            java.lang.Object r0 = r1.A01
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r3 = r0.get()
            boolean r0 = r3 instanceof X.BDL
            r2 = 0
            if (r0 == 0) goto L31
            X.BDL r3 = (X.BDL) r3
            if (r3 != 0) goto L2d
        L1c:
            java.lang.String r1 = "could not cast cacheRequestInfo object in DraftThumbnailLoader#getThumbnailLoadListener. source: "
            boolean r0 = r4 instanceof X.C218169ko
            if (r0 == 0) goto L2e
            java.lang.String r0 = "ClipsDraftThumbnailLoader"
        L24:
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.String r0 = "DraftThumbnailLoader"
            X.AbstractC12120kG.A06(r0, r1, r2)
        L2d:
            return r3
        L2e:
            java.lang.String r0 = "StoryDraftThumbnailLoader"
            goto L24
        L31:
            r3 = r2
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC188908Yg.A00(X.2nt):X.BDL");
    }
}
