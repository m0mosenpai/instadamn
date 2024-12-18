package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.8Rm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187198Rm implements InterfaceC11380iw, InterfaceC187208Rn, C7W5, C8F1, InterfaceC1810781j, InterfaceC187088Rb {
    public static final String __redex_internal_original_name = "MultiMediaEditController";
    public int A00;
    public int A01;
    public C26086BgF A02;
    public IgImageView A03;
    public InterfaceC184058Eu A04;
    public C6WQ A05;
    public Runnable A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Activity A0A;
    public final View.OnTouchListener A0B;
    public final View A0C;
    public final View A0D;
    public final AbstractC59962oe A0E;
    public final InterfaceC11380iw A0F;
    public final UserSession A0G;
    public final TouchInterceptorFrameLayout A0H;
    public final C57012jc A0I;
    public final C57012jc A0J;
    public final C8RZ A0K;
    public final C187278Ru A0L;
    public final C8LZ A0M;
    public final C183688Ct A0N;
    public final C185948Mo A0O;
    public final TargetViewSizeProvider A0P;
    public final AnonymousClass840 A0Q;
    public final C88D A0R;
    public final C81J A0S;
    public final C187128Rf A0T;
    public final C1830289x A0U;
    public final C185738Ls A0V;
    public final C8MW A0W;
    public final InterfaceC185598Lb A0X;
    public final C187218Ro A0Y;
    public final InterfaceC1810081c A0Z;
    public final C8LT A0a;
    public final C8MP A0b;
    public final C187318Ry A0c;
    public final C8M1 A0d;
    public final C8ST A0e;
    public final InteractiveDrawableContainer A0f;
    public final Runnable A0g;
    public final Runnable A0h;
    public final String A0i;
    public final String A0j;
    public final Map A0k;
    public final InterfaceC08830cm A0l;
    public final InterfaceC08830cm A0m;
    public final InterfaceC08830cm A0n;
    public final int A0o;
    public final C1GL A0p;
    public final C8HI A0q;
    public final AnonymousClass825 A0r;

    @Override // X.C8F1
    public final void DCs(boolean z) {
        A07(null);
    }

    @Override // X.InterfaceC187208Rn
    public final void DNF(C9NH c9nh, int i) {
    }

    @Override // X.InterfaceC187208Rn
    public final void DNz() {
    }

    @Override // X.InterfaceC187208Rn
    public final void DO2(List list) {
    }

    private C198308pf A00(String str) {
        Integer num;
        C183688Ct c183688Ct = this.A0N;
        C183978Ee c183978Ee = c183688Ct.A0O;
        c183978Ee.getClass();
        C198308pf c198308pf = new C198308pf(null, c183978Ee, str, false);
        C1816783z c1816783z = this.A0Q.A02;
        C81M c81m = c183688Ct.A0B;
        C1815483h c1815483h = c1816783z.A01;
        List list = c1815483h.A0n;
        list.add(c198308pf);
        c1815483h.A0p.add(c81m);
        if (list.size() == 1) {
            num = C05F.A01;
        } else {
            num = C05F.A0C;
        }
        c1815483h.A0B = num;
        this.A0c.A09(list.size() - 1);
        return c198308pf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d5, code lost:
    
        if (r6 == r5) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(com.instagram.common.gallery.Medium r21, final X.C187198Rm r22, final X.C187318Ry r23, final X.C38321qM r24) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187198Rm.A01(com.instagram.common.gallery.Medium, X.8Rm, X.8Ry, X.1qM):void");
    }

    public static void A02(C187198Rm c187198Rm) {
        int ordinal = c187198Rm.A0Q.A02.A01().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                c187198Rm.A0O.A0O(c187198Rm.A0K, true);
                return;
            }
            throw new UnsupportedOperationException("Unknown captured media type");
        }
        c187198Rm.A0M.A0I(c187198Rm.A0K);
    }

    public static void A03(C187198Rm c187198Rm, C198308pf c198308pf, TreeMap treeMap, int i) {
        boolean z;
        Object obj;
        ArrayList arrayList = new ArrayList();
        C1810981l c1810981l = c187198Rm.A0Q.A02.A01.A0Y;
        if (c1810981l != null && ((obj = c1810981l.A08.A00) == C81T.A00 || obj == C208509Kk.A00)) {
            z = true;
        } else {
            z = false;
        }
        if (c198308pf.A05 == EnumC198268pb.A07) {
            C195868lW c195868lW = c198308pf.A03;
            c195868lW.getClass();
            C44059Jdk A00 = C44059Jdk.A00(c195868lW.A0k, 0);
            C14360o3.A07(A00);
            if (A00.A03 >= 15500 && !z) {
                Iterator it = AbstractC23035ADr.A01(c195868lW, 4, 15000, 5000).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C198308pf((C195868lW) it.next()));
                }
                treeMap.put(Integer.valueOf(i), arrayList);
                A06(c187198Rm, treeMap);
            }
        }
        arrayList.add(c198308pf);
        treeMap.put(Integer.valueOf(i), arrayList);
        A06(c187198Rm, treeMap);
    }

    public static void A05(C187198Rm c187198Rm, C38321qM c38321qM) {
        for (Drawable drawable : c187198Rm.A0f.getAllDrawables()) {
            if (drawable instanceof C194808jg) {
                ArrayList A06 = ((C194808jg) drawable).A06(C202588xc.class);
                if (!A06.isEmpty()) {
                    Iterator it = A06.iterator();
                    while (it.hasNext()) {
                        if ("birthday_sticker_id".equals(((C202588xc) it.next()).A0O)) {
                            C148276lx c148276lx = C148276lx.A18;
                            c187198Rm.A0N.A0i(C202288x8.A0F.A01(c187198Rm.A0A, c187198Rm.A0G, c148276lx, null, null, c38321qM.A1B() * 1000), AMV.A00());
                        }
                    }
                }
            }
        }
    }

    public static void A06(C187198Rm c187198Rm, TreeMap treeMap) {
        GalleryItem galleryItem;
        if (c187198Rm.A00 == 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = new ArrayList(treeMap.values()).iterator();
            while (it.hasNext()) {
                for (C198308pf c198308pf : (List) it.next()) {
                    arrayList2.add(c198308pf);
                    if (c198308pf.A05.ordinal() != 0) {
                        C195868lW c195868lW = c198308pf.A03;
                        c195868lW.getClass();
                        galleryItem = new GalleryItem(c195868lW);
                    } else {
                        C183978Ee c183978Ee = c198308pf.A02;
                        c183978Ee.getClass();
                        galleryItem = new GalleryItem(c183978Ee, c183978Ee.A0h);
                    }
                    arrayList.add(new C9NH(galleryItem, null));
                }
            }
            c187198Rm.A0Y.EWl(arrayList);
            int size = arrayList.size();
            C187318Ry c187318Ry = c187198Rm.A0c;
            if (size > 1) {
                RecyclerView recyclerView = c187318Ry.A0L;
                recyclerView.setItemAnimator(null);
                c187318Ry.A0B(false);
                recyclerView.setEnabled(false);
                c187318Ry.A0J.setEnabled(false);
            } else {
                c187318Ry.A0A(false);
            }
            c187198Rm.A0B(arrayList2);
        }
    }

    public final void A07(C187318Ry c187318Ry) {
        Bitmap A03;
        Bitmap A00;
        if (this.A09) {
            C187318Ry c187318Ry2 = this.A0c;
            c187318Ry2.A0B(false);
            c187318Ry2.A0C(true, false);
            C8SE c8se = c187318Ry2.A0S;
            RectF rectF = new RectF(0.0f, 0.0f, c8se.A01, c8se.A00);
            InterfaceC159417Dc interfaceC159417Dc = c8se.A03;
            Bitmap A08 = C1NC.A08(interfaceC159417Dc.By6(interfaceC159417Dc.Bsl()), (int) rectF.width(), (int) rectF.height());
            int ordinal = this.A0Q.A02.A01().ordinal();
            C210399Se c210399Se = null;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    A03 = this.A0O.A0F(A08, rectF, null);
                } else {
                    throw new UnsupportedOperationException("Unknown captured media type");
                }
            } else {
                ArrayList A0T = this.A0f.A0T(C210399Se.class);
                C22P c22p = this.A0N.A0r;
                if ((c22p == C22P.A2Y || c22p == C22P.A0Z) && !A0T.isEmpty()) {
                    c210399Se = (C210399Se) A0T.get(0);
                }
                C8LZ c8lz = this.A0M;
                if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                    C81N c81n = c8lz.A0E;
                    rectF.set(0.0f, 0.0f, c81n.A05().getWidth(), c81n.A05().getHeight());
                    AbstractC12120kG.A01("PhotoViewController#takeScreenshot:invalidScalingRect", "");
                }
                C81N c81n2 = c8lz.A0E;
                if (A08 == null) {
                    int width = (int) rectF.width();
                    int height = (int) rectF.height();
                    MultiListenerTextureView multiListenerTextureView = c81n2.A0D;
                    if (multiListenerTextureView != null) {
                        A03 = multiListenerTextureView.getBitmap(width, height);
                    } else {
                        A03 = null;
                    }
                } else {
                    A03 = c81n2.A03(A08);
                }
                if (A03 != null) {
                    Canvas canvas = new Canvas(A03);
                    if (c210399Se != null && (A00 = c210399Se.A00(0L)) != null) {
                        canvas.drawBitmap(C0fK.A00(A00, (int) (A00.getWidth() * (rectF.width() / c81n2.A05().getWidth())), (int) (A00.getHeight() * (rectF.height() / c81n2.A05().getHeight())), false), (rectF.width() - r11.getWidth()) / 2.0f, (rectF.height() - r11.getHeight()) / 2.0f, (Paint) null);
                    }
                    Bitmap A01 = ((C8LK) c8lz.A0F.A00.A00()).A01(A08, rectF, null, 1.0f, 1.0f, -1, false, true, true, true);
                    if (A01 != null) {
                        canvas.drawBitmap(A01, 0.0f, 0.0f, (Paint) null);
                    }
                }
            }
            InterfaceC159417Dc interfaceC159417Dc2 = c187318Ry2.A0R;
            int Bsl = interfaceC159417Dc2.Bsl();
            interfaceC159417Dc2.AAN(A03, Bsl);
            c8se.notifyItemChanged(Bsl);
            if (c187318Ry != null) {
                InterfaceC159417Dc interfaceC159417Dc3 = c187318Ry.A0R;
                int Bsl2 = interfaceC159417Dc3.Bsl();
                interfaceC159417Dc3.AAN(A03, Bsl2);
                c187318Ry.A0S.notifyItemChanged(Bsl2);
            }
            this.A0H.COs(this.A0B);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (0 < r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r1 > r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        X.C187318Ry.A05(r3, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(java.lang.String r7) {
        /*
            r6 = this;
            X.8Ro r5 = r6.A0Y
            int r4 = r5.A00(r7)
            int r0 = r5.A00
            if (r0 != r4) goto L22
            X.8Ry r3 = r6.A0c
            X.7Dc r2 = r3.A0R
            if (r0 != 0) goto L26
            int r0 = r2.getCount()
            int r1 = r0 + (-1)
            int r0 = r2.Bsl()
            int r0 = r0 + 1
            if (r1 <= r0) goto L1f
        L1e:
            r1 = r0
        L1f:
            X.C187318Ry.A05(r3, r1)
        L22:
            r5.removeItem(r4)
            return
        L26:
            int r0 = r2.Bsl()
            int r0 = r0 + (-1)
            r1 = 0
            if (r1 >= r0) goto L1f
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187198Rm.A09(java.lang.String):void");
    }

    public final void A0A(List list) {
        GalleryItem galleryItem;
        C187218Ro c187218Ro = this.A0Y;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C198308pf c198308pf = (C198308pf) it.next();
            if (c198308pf.A05.ordinal() != 0) {
                C195868lW c195868lW = c198308pf.A03;
                if (c195868lW != null) {
                    String str = c198308pf.A06;
                    C14360o3.A07(str);
                    galleryItem = new GalleryItem(null, null, null, null, null, null, null, c195868lW, C05F.A0u, str, -1);
                }
                galleryItem = null;
            } else {
                C183978Ee c183978Ee = c198308pf.A02;
                if (c183978Ee != null) {
                    String str2 = c198308pf.A06;
                    C14360o3.A07(str2);
                    galleryItem = new GalleryItem(c183978Ee, str2);
                }
                galleryItem = null;
            }
            C14360o3.A0A(galleryItem);
            arrayList.add(new C9NH(galleryItem, null));
        }
        c187218Ro.EWl(arrayList);
        C187318Ry c187318Ry = this.A0c;
        c187318Ry.A0B(true);
        List list2 = this.A0Q.A02.A01.A0n;
        List unmodifiableList = Collections.unmodifiableList(list2);
        C14360o3.A07(unmodifiableList);
        Iterator it2 = unmodifiableList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (((C198308pf) it2.next()).A00 != null) {
                C6WQ c6wq = new C6WQ(this.A0A);
                this.A05 = c6wq;
                c6wq.setContentView(R.layout.layout_superlative_loader);
                if (this.A05.getWindow() != null) {
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    layoutParams.copyFrom(this.A05.getWindow().getAttributes());
                    ((ViewGroup.LayoutParams) layoutParams).width = -1;
                    ((ViewGroup.LayoutParams) layoutParams).height = -1;
                    this.A05.getWindow().setAttributes(layoutParams);
                }
                this.A05.setCancelable(false);
                C0fJ.A00(this.A05);
            }
        }
        C8SE c8se = c187318Ry.A0S;
        RectF rectF = new RectF(0.0f, 0.0f, c8se.A01, c8se.A00);
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        for (int i = 0; i < list2.size(); i++) {
            C198308pf c198308pf2 = (C198308pf) list2.get(i);
            C14360o3.A07(c198308pf2);
            if (c198308pf2.A05 == EnumC198268pb.A04) {
                C8RZ c8rz = this.A0K;
                String str3 = c198308pf2.A06;
                C14360o3.A0B(str3, 0);
                AbstractC24481Hr abstractC24481Hr = (AbstractC24481Hr) c8rz.A0L.get(str3);
                if (abstractC24481Hr != null) {
                    abstractC24481Hr.A03(new C23662Adx(rectF, this, c198308pf2, height, width, i));
                }
            } else if (c198308pf2.A05 == EnumC198268pb.A07 && c198308pf2.A00 != null) {
                C195868lW c195868lW2 = c198308pf2.A03;
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                if (c195868lW2 != null) {
                    try {
                        mediaMetadataRetriever.setDataSource(c195868lW2.A0k);
                        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(0L);
                        if (frameAtTime != null) {
                            Bitmap bitmap = c198308pf2.A00;
                            int height2 = frameAtTime.getHeight();
                            int width2 = frameAtTime.getWidth();
                            Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            Paint paint = new Paint(2);
                            canvas.drawBitmap(frameAtTime, 0.0f, 0.0f, paint);
                            if (bitmap.getWidth() != width2 || bitmap.getHeight() != height2) {
                                bitmap = C0fK.A00(bitmap, width2, height2, false);
                            }
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                            c187318Ry.A0R.AAN(createBitmap, i);
                            c8se.notifyItemChanged(i);
                        }
                    } catch (Exception e) {
                        AbstractC12120kG.A0H("Exception calling MediaMetadataRetriever#release", e);
                    }
                }
            }
        }
    }

    public final void A0B(List list) {
        if (this.A07) {
            this.A07 = false;
            this.A0Q.A02.A09(list);
            this.A0L.Dve(this.A02);
            this.A02 = null;
            return;
        }
        InterfaceC1810081c interfaceC1810081c = this.A0Z;
        AbstractC197108nf.A00(interfaceC1810081c);
        ((C1809981b) interfaceC1810081c).A01.A04(new C187708Tn(list, null));
    }

    @Override // X.C7W5
    public final void CkQ(CharSequence charSequence, boolean z) {
        C8M1 c8m1 = this.A0d;
        String charSequence2 = charSequence.toString();
        C14360o3.A0B(charSequence2, 0);
        if (z) {
            c8m1.A01.A01(charSequence2);
        }
    }

    @Override // X.InterfaceC187098Rc
    public final void DCQ() {
        if (this.A08) {
            this.A08 = false;
            this.A0C.postOnAnimation(this.A0h);
        }
    }

    @Override // X.InterfaceC187098Rc
    public final void DCR() {
        this.A0C.postOnAnimation(this.A0h);
    }

    @Override // X.C8F1
    public final void DCt() {
        if (this.A09) {
            C187318Ry c187318Ry = this.A0c;
            c187318Ry.A0C(false, false);
            c187318Ry.A0A(false);
            this.A0H.COs(null);
        }
    }

    @Override // X.InterfaceC187208Rn
    public final void DNc(int i, int i2) {
        C1815483h c1815483h = this.A0Q.A02.A01;
        List list = c1815483h.A0n;
        list.add(i2, list.remove(c1815483h.A00));
        c1815483h.A00 = i2;
        C1815483h.A00(c1815483h);
    }

    @Override // X.InterfaceC187208Rn
    public final void DNm(C9NH c9nh, int i) {
        this.A0Q.A02.A01.A06(i);
    }

    @Override // X.InterfaceC187208Rn
    public final void DNp(C9NH c9nh, int i) {
        this.A0f.A0S = false;
        this.A0O.A0x.A01();
        C8RZ c8rz = this.A0K;
        c8rz.A05 = true;
        c8rz.A0E(false);
        c8rz.A03 = false;
        int ordinal = c8rz.A0F.A02.A01().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C185948Mo c185948Mo = c8rz.A0C;
                boolean z = c8rz.A0O;
                C185948Mo.A09(c185948Mo);
                C198528q1 c198528q1 = c185948Mo.A0q.A04;
                if (c198528q1 != null) {
                    c198528q1.A02();
                }
                c185948Mo.A0j.A03(z);
                c185948Mo.A0A = null;
            } else {
                throw new UnsupportedOperationException("Unknown captured media type");
            }
        } else {
            c8rz.A0A.A0H();
        }
        C1815483h c1815483h = this.A0Q.A02.A01;
        c1815483h.A00 = i;
        C1815483h.A00(c1815483h);
        A02(this);
        this.A0N.A0a();
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        Intent intent;
        if (((EnumC1810181d) obj).ordinal() == 39) {
            Integer num = null;
            if (obj3 instanceof C8VK) {
                C8VK c8vk = (C8VK) obj3;
                num = Integer.valueOf(c8vk.A00);
                intent = c8vk.A01;
            } else if (obj3 instanceof C8VM) {
                C8VM c8vm = (C8VM) obj3;
                int i = 0;
                if (c8vm.A01) {
                    i = -1;
                }
                num = Integer.valueOf(i);
                intent = c8vm.A00;
            } else {
                intent = null;
            }
            Integer num2 = this.A0Q.A02.A01.A0B;
            C14360o3.A07(num2);
            if (num2 == C05F.A0C && num != null && num.intValue() == -1 && intent != null) {
                A04(this, new AH3(intent.getParcelableArrayListExtra("bundle_extra_parcelable_story_share_targets"), intent.getParcelableArrayListExtra("bundle_extra_user_story_targets")), intent.getBooleanExtra("bundle_extra_user_tapped_done_button", false));
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        C1810981l c1810981l = this.A0Q.A02.A01.A0Y;
        c1810981l.getClass();
        if (c1810981l.A08.A00 == C81T.A00) {
            return "direct_postcapture_camera";
        }
        return "stories_postcapture_camera";
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r4.isEmpty() != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, X.1vN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(X.C187198Rm r12, X.AH3 r13, boolean r14) {
        /*
            boolean r0 = r13.A01()
            r5 = 0
            if (r0 == 0) goto Laa
            X.0do r0 = X.AH4.A02
            java.lang.Object r0 = r0.getValue()
            X.AH4 r0 = (X.AH4) r0
            android.graphics.Bitmap r8 = r0.A00
            r0.A00 = r5
        L13:
            com.instagram.common.session.UserSession r7 = r12.A0G
            java.util.List r4 = r13.A00
            if (r4 == 0) goto L20
            boolean r1 = r4.isEmpty()
            r0 = 1
            if (r1 == 0) goto L21
        L20:
            r0 = 0
        L21:
            r3 = 0
            X.C14360o3.A0B(r7, r3)
            if (r0 == 0) goto L33
            X.1My r1 = X.AbstractC25651Mw.A00(r7)
            X.Ad1 r0 = new X.Ad1
            r0.<init>()
            r1.E4s(r0)
        L33:
            if (r14 == 0) goto Le9
            X.2hJ r1 = X.C55772hI.A00(r7)
            int r0 = r12.A0o
            int r0 = r0 + 2
            r1.A0C(r12, r5, r0)
            X.2hJ r1 = X.C55772hI.A00(r7)
            android.app.Activity r0 = r12.A0A
            r1.A07(r0, r12)
            X.2hJ r2 = X.C55772hI.A00(r7)
            X.8HI r1 = r12.A0q
            java.lang.String r0 = "unknown"
            r2.A0D(r0, r1)
            X.840 r0 = r12.A0Q
            X.83z r0 = r0.A02
            r0.A06()
            X.81J r2 = r12.A0S
            X.Aap r0 = r2.A0d
            if (r0 == 0) goto Lb0
            boolean r0 = r13.A01()
            if (r0 == 0) goto Lb0
            X.Aap r9 = r2.A0d
            r9.getClass()
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r6 = r12.A0P
            java.util.List r0 = r13.A01
            if (r0 == 0) goto La8
            com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.copyOf(r0)
        L76:
            java.lang.String r0 = "If we are animating back to the stories tray, there must be valid user story targets"
            X.C18C.A07(r10, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r10.iterator()
        L84:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r10 = r11.next()
            com.instagram.pendingmedia.model.UserStoryTarget r10 = (com.instagram.pendingmedia.model.UserStoryTarget) r10
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A0C
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L84
            X.0sy r0 = X.C08730cb.A00(r7)
            com.instagram.user.model.User r0 = r0.A00()
            java.lang.String r0 = r0.getId()
            r1.add(r0)
            goto L84
        La8:
            r10 = 0
            goto L76
        Laa:
            r8 = r5
            goto L13
        Lad:
            r9.A00(r8, r7, r6, r1)
        Lb0:
            X.BDm r1 = r2.A0l
            java.util.List r0 = r13.A01
            if (r0 == 0) goto Lea
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
        Lba:
            if (r4 == 0) goto Lc0
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
        Lc0:
            r1.AIG(r5, r0, r4, r3)
            X.0cm r0 = r12.A0n
            java.lang.Object r1 = r0.get()
            X.8Xl r1 = (X.InterfaceC188718Xl) r1
            if (r1 == 0) goto Ldb
            r0 = r1
            X.8Xk r0 = (X.C188708Xk) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto Ldb
            boolean r0 = r2.A48
            if (r0 == 0) goto Ldb
            r1.APf()
        Ldb:
            X.81c r0 = r12.A0Z
            X.81b r0 = (X.C1809981b) r0
            X.81e r1 = r0.A01
            X.9z7 r0 = new X.9z7
            r0.<init>()
            r1.A04(r0)
        Le9:
            return
        Lea:
            r0 = 0
            goto Lba
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187198Rm.A04(X.8Rm, X.AH3, boolean):void");
    }

    public final void A08(final C187318Ry c187318Ry, final C38321qM c38321qM) {
        if (c38321qM.A63()) {
            C121275eQ A00 = AbstractC50633MWu.A00(this.A0A, this.A0G, c38321qM, __redex_internal_original_name);
            A00.A00 = new C2AH() { // from class: X.9gu
                @Override // X.C2AH
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    File file = (File) obj;
                    C38321qM c38321qM2 = c38321qM;
                    int A0J = AbstractC167017dG.A0J(c38321qM2);
                    C14360o3.A0B(file, 0);
                    C187198Rm.A01(C8IU.A03(file, A0J, 0), C187198Rm.this, c187318Ry, c38321qM2);
                }
            };
            C1GJ.A03(A00);
            return;
        }
        A01(null, this, c187318Ry, c38321qM);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x012b, code lost:
    
        if (r8.A00 != 8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C187198Rm(android.view.View r41, android.view.View r42, X.C22P r43, X.InterfaceC11380iw r44, X.C57012jc r45, X.C8RZ r46, X.C8LZ r47, X.C183688Ct r48, X.C185948Mo r49, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r50, X.C8HI r51, X.AnonymousClass840 r52, X.C88D r53, X.C81J r54, X.C187128Rf r55, X.C1830289x r56, com.instagram.creation.capture.quickcapture.save.CachingVideoSaver r57, X.InterfaceC1810081c r58, X.C8LT r59, X.AnonymousClass825 r60, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r61, java.lang.Runnable r62, java.util.Map r63, X.InterfaceC08830cm r64, X.InterfaceC08830cm r65, X.InterfaceC08830cm r66, int r67) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187198Rm.<init>(android.view.View, android.view.View, X.22P, X.0iw, X.2jc, X.8RZ, X.8LZ, X.8Ct, X.8Mo, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.8HI, X.840, X.88D, X.81J, X.8Rf, X.89x, com.instagram.creation.capture.quickcapture.save.CachingVideoSaver, X.81c, X.8LT, X.825, com.instagram.ui.widget.interactive.InteractiveDrawableContainer, java.lang.Runnable, java.util.Map, X.0cm, X.0cm, X.0cm, int):void");
    }
}
