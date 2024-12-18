package X;

import android.content.Intent;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;
import java.util.Map;

/* loaded from: classes9.dex */
public final class MY2 implements MSD, InterfaceC58052Pod, C8BR, InterfaceC1810781j {
    public static final String __redex_internal_original_name = "StoriesMusicSearchController";
    public View A00;
    public C8BN A01;
    public EnumC50631MWs A02;
    public C52166N6v A03;
    public MYM A04;
    public Map A05;
    public boolean A06;
    public final ViewStub A07;
    public final AbstractC10360h2 A08;
    public final UserSession A09;
    public final AnonymousClass844 A0A;
    public final C677733r A0B;
    public final InterfaceC58154PqJ A0C;
    public final String A0D;
    public final java.util.Set A0E;

    public MY2(ViewStub viewStub, AbstractC10360h2 abstractC10360h2, UserSession userSession, InterfaceC1810081c interfaceC1810081c, AnonymousClass844 anonymousClass844, C677733r c677733r, InterfaceC58154PqJ interfaceC58154PqJ, Map map) {
        C14360o3.A0B(viewStub, 1);
        AbstractC167017dG.A1T(anonymousClass844, c677733r);
        this.A07 = viewStub;
        this.A08 = abstractC10360h2;
        this.A09 = userSession;
        this.A0A = anonymousClass844;
        this.A0B = c677733r;
        this.A0C = interfaceC58154PqJ;
        this.A05 = map;
        this.A0E = AbstractC31171DnF.A0l();
        viewStub.getContext().getColor(R.color.black_50_transparent);
        this.A02 = EnumC50631MWs.A0I;
        interfaceC1810081c.A82(this);
        this.A0D = "music_search";
    }

    @Override // X.InterfaceC58052Pod
    public final int B8Q(EnumC53139Nes enumC53139Nes) {
        int A05 = AbstractC25227BEk.A05(enumC53139Nes, 0);
        if (A05 != 1) {
            if (A05 != 0) {
                if (A05 == 2) {
                    return R.id.stories_music_search_saved_page_container;
                }
                throw AbstractC166987dD.A12("Unsupported MusicSearchMode");
            }
            return R.id.stories_music_search_landing_page_container;
        }
        return R.id.stories_music_search_search_results_container;
    }

    @Override // X.C8BR
    public final /* synthetic */ void CJG(int i, int i2, Intent intent) {
    }

    @Override // X.MSD
    public final /* synthetic */ void DhN() {
    }

    private final EnumC1810381f A00() {
        int ordinal = this.A02.ordinal();
        if (ordinal != 0 && ordinal != 13) {
            return EnumC1810381f.A02;
        }
        return EnumC1810381f.A03;
    }

    @Override // X.MSD
    public final java.util.Set Acr() {
        return this.A0E;
    }

    @Override // X.MSD
    public final boolean CJQ() {
        MYM mym = this.A04;
        if (mym != null) {
            return mym.A0A();
        }
        C52166N6v c52166N6v = this.A03;
        if (c52166N6v != null) {
            return c52166N6v.onBackPressed();
        }
        return false;
    }

    @Override // X.MSD
    public final void CxN() {
        this.A0C.DUU();
    }

    @Override // X.C8BR
    public final void DUE() {
        this.A0C.DUU();
    }

    @Override // X.C8BR
    public final void DUG(JIN jin, MusicBrowseCategory musicBrowseCategory, String str, String str2) {
        this.A0C.DUj(jin, musicBrowseCategory, str, str2);
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        if (obj != EnumC1810181d.A02 && obj != EnumC1810181d.A03) {
            if (obj2 != EnumC1810181d.A08) {
                return;
            }
        } else if (obj3 instanceof C188208Vl) {
            MYM mym = this.A04;
            if (mym == null) {
                return;
            }
            mym.A09(C05F.A00);
            return;
        }
        MYM mym2 = this.A04;
        if (mym2 != null) {
            mym2.A08(C05F.A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (r22.A00 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        r2 = X.AbstractC31173DnH.A0E(r22.A07, com.facebook.R.layout.layout_stories_music_search);
        r22.A00 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        if (r2 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        r22.A0E.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
    
        if (A00() != X.EnumC1810381f.A03) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
    
        r7 = com.instagram.api.schemas.MusicProduct.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
    
        r8 = r22.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
    
        if (X.C36A.A0E(r8) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        r5 = com.google.common.collect.ImmutableList.of((java.lang.Object) com.instagram.music.common.constants.AudioTrackType.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        X.C14360o3.A07(r5);
        r22.A04 = new X.MYM(r2, r22.A08, r22.A01, r5, null, r7, r8, r22.A0A, null, r22.A0B, r22.A0C, r22, A00(), null, null, r22.A05, 0, false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0127, code lost:
    
        r5 = com.google.common.collect.ImmutableList.of((java.lang.Object) com.instagram.music.common.constants.AudioTrackType.A03, (java.lang.Object) com.instagram.music.common.constants.AudioTrackType.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0130, code lost:
    
        r7 = com.instagram.api.schemas.MusicProduct.A0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
    
        r2 = r22.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
    
        if (r2 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f5, code lost:
    
        if (r22.A06 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f7, code lost:
    
        r1 = com.instagram.music.search.tabloader.MusicOverlaySearchTab.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f9, code lost:
    
        r2.A07(r1, X.C05F.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0125, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fe, code lost:
    
        r2 = new X.C55175Ode();
        r8 = r22.A09;
        r9 = r22.A0D;
        r10 = r22.A0A.BVY();
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r22.A04 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0113, code lost:
    
        if (A00() != X.EnumC1810381f.A03) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0115, code lost:
    
        r7 = com.instagram.api.schemas.MusicProduct.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        r2.A04(null, r22.A01, null, r22.A02, r7, r8, r9, r10, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0121, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0122, code lost:
    
        r7 = com.instagram.api.schemas.MusicProduct.A0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0096, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36322581372414295L) == false) goto L33;
     */
    @Override // X.MSD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E2K() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MY2.E2K():void");
    }

    @Override // X.MSD
    public final void close() {
        MYM mym = this.A04;
        if (mym != null) {
            mym.A08(C05F.A00);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0D;
    }

    @Override // X.MSD
    public final boolean isScrolledToBottom() {
        MYM mym = this.A04;
        if (mym != null) {
            InterfaceC08430c6 A01 = MYM.A01(mym);
            if (A01 instanceof InterfaceC58055Pog) {
                return ((InterfaceC58055Pog) A01).isScrolledToBottom();
            }
            return true;
        }
        C52166N6v c52166N6v = this.A03;
        if (c52166N6v != null) {
            return c52166N6v.isScrolledToBottom();
        }
        return true;
    }

    @Override // X.MSD
    public final boolean isScrolledToTop() {
        MYM mym = this.A04;
        if (mym != null) {
            InterfaceC08430c6 A01 = MYM.A01(mym);
            if (A01 instanceof InterfaceC58055Pog) {
                return ((InterfaceC58055Pog) A01).isScrolledToTop();
            }
            if (A01 instanceof C51D) {
                return ((C51D) A01).isScrolledToTop();
            }
            return true;
        }
        C52166N6v c52166N6v = this.A03;
        if (c52166N6v != null) {
            return c52166N6v.isScrolledToTop();
        }
        return true;
    }

    @Override // X.InterfaceC58052Pod
    public final String Aer(EnumC53139Nes enumC53139Nes) {
        return AbstractC167017dG.A0n(enumC53139Nes, __redex_internal_original_name, AbstractC43594JPz.A0x(enumC53139Nes));
    }
}
