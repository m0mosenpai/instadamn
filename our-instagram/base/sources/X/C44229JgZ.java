package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.video.heroplayer.ipc.HeroScrollSetting;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.JgZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44229JgZ extends C1I4 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C44229JgZ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A0N;
        int i2;
        User user;
        Object obj;
        C44761Jri c44761Jri;
        C45696KKz A00;
        switch (this.A00) {
            case 0:
                A0N = AbstractC167017dG.A0N(recyclerView, -649052056);
                if (i == 0) {
                    C45503KCs.A01((C45503KCs) this.A02);
                }
                super.onScrollStateChanged(recyclerView, i);
                i2 = -2069998162;
                break;
            case 1:
            case 3:
            default:
                super.onScrollStateChanged(recyclerView, i);
                return;
            case 2:
                A0N = C0f9.A03(-954192691);
                C65823Tug c65823Tug = (C65823Tug) this.A02;
                HeroScrollSetting heroScrollSetting = ((C66101Tzc) this.A01).A02;
                if (heroScrollSetting != null) {
                    C41711wL.A01(c65823Tug.A0C).A0D(heroScrollSetting, AbstractC167007dF.A1M(i));
                }
                if (i == 0) {
                    c65823Tug.A0D.Dj3();
                }
                i2 = 951888791;
                break;
            case 4:
                A0N = AbstractC167017dG.A0N(recyclerView, -207126620);
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    C45510KCz c45510KCz = (C45510KCz) this.A02;
                    int A002 = C45510KCz.A00(c45510KCz);
                    if (A002 == c45510KCz.A00) {
                        if (C45510KCz.A03(c45510KCz).A00) {
                            C44761Jri A02 = C45510KCz.A02(c45510KCz);
                            if (A02 != null && (A00 = A02.A00()) != null) {
                                A00.A0H();
                            }
                            C45510KCz.A03(c45510KCz).A00();
                        }
                        i2 = 1238352942;
                        break;
                    } else {
                        c45510KCz.A00 = A002;
                        C66362zD c66362zD = c45510KCz.A0D;
                        LZV lzv = null;
                        if (c66362zD == null) {
                            AbstractC31171DnF.A0t();
                            throw C00O.createAndThrow();
                        }
                        List AuX = c66362zD.A04.AuX();
                        C14360o3.A07(AuX);
                        Object A0O = AbstractC001800i.A0O(AuX, A002);
                        if (A0O instanceof LZV) {
                            lzv = (LZV) A0O;
                        }
                        C26086BgF A01 = C45510KCz.A01(lzv, c45510KCz);
                        C3CY A03 = C45510KCz.A03(c45510KCz);
                        if (lzv != null) {
                            user = lzv.A00;
                        } else {
                            user = null;
                        }
                        A03.A03(A01, user);
                        int A0T = ((AbstractC70663Fe) this.A01).A0T();
                        for (int i3 = 0; i3 < A0T; i3++) {
                            View childAt = recyclerView.getChildAt(i3);
                            if (childAt != null) {
                                obj = childAt.getTag();
                            } else {
                                obj = null;
                            }
                            if ((obj instanceof C44761Jri) && (c44761Jri = (C44761Jri) obj) != null) {
                                c44761Jri.A01();
                            }
                        }
                        C45510KCz.A03(c45510KCz).A00();
                    }
                }
                i2 = -80582865;
                break;
            case 5:
                A0N = C0f9.A03(381747415);
                if (i == 0) {
                    ((C42824Ix0) this.A01).A00.mRecyclerView.A15(this);
                    ((Runnable) this.A02).run();
                }
                i2 = -1643934374;
                break;
        }
        C0f9.A0A(i2, A0N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        r7 = r6.A03;
        r0 = r7.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        r5 = r0.size();
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        if (r4 >= r5) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        r0 = r7.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        if (r0 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
    
        if (r8 != X.AbstractC31176DnK.A01(r0, r4)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        r2 = r7.A0E;
        r1 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
    
        if (((X.C38577Gxg) r2.get(r1)).A08 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        if (((X.C38577Gxg) r2.get(r1)).A07 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        r0 = ((X.C38577Gxg) r2.get(r1)).A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00be, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
    
        com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment.A02(r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c3, code lost:
    
        X.C0f9.A0A(1603438506, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ca, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1I4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44229JgZ.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
