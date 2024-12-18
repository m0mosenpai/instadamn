package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.loadmore.LoadMoreButton;

/* renamed from: X.Gov, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38067Gov extends AbstractC155316yK {
    public MusicBrowseCategory A00;
    public final Context A01;
    public final C07X A02;
    public final MusicProduct A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final JPe A06;
    public final C9PK A07;
    public final C50664MYh A08;
    public final C50669MYn A09;
    public final InterfaceC62602sz A0A;
    public final boolean A0B;
    public final C8SI A0C;
    public final boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.2xd, java.lang.Object] */
    public C38067Gov(Context context, C07X c07x, MusicProduct musicProduct, InterfaceC11380iw interfaceC11380iw, UserSession userSession, MusicBrowseCategory musicBrowseCategory, JPe jPe, C9PK c9pk, C50664MYh c50664MYh, C50669MYn c50669MYn, InterfaceC62602sz interfaceC62602sz, boolean z) {
        super((AbstractC65412xd) new Object());
        AbstractC25233BEq.A0x(2, userSession, interfaceC62602sz, musicBrowseCategory);
        AbstractC167007dF.A1I(c50669MYn, 7, c50664MYh);
        this.A01 = context;
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
        this.A0A = interfaceC62602sz;
        this.A00 = musicBrowseCategory;
        this.A03 = musicProduct;
        this.A09 = c50669MYn;
        this.A08 = c50664MYh;
        this.A07 = c9pk;
        this.A06 = jPe;
        this.A02 = c07x;
        this.A0D = z;
        this.A0C = new C8SI(0L);
        this.A0B = C18U.A06(C06090Tz.A05, userSession, 36312608458015941L);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C3OO nqp;
        String str;
        C14360o3.A0B(viewGroup, 0);
        switch (i) {
            case 0:
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View A00 = A00(R.layout.music_search_row_track, viewGroup);
                UserSession userSession = this.A05;
                JPe jPe = this.A06;
                boolean z = this.A0B;
                MusicProduct musicProduct = this.A03;
                MusicBrowseCategory musicBrowseCategory = this.A00;
                String str2 = musicBrowseCategory.A06;
                if (str2 == null) {
                    str2 = musicBrowseCategory.A00();
                }
                if (C14360o3.A0K(str2, "trending")) {
                    str = MSV.A00(139);
                } else {
                    str = this.A00.A04;
                    if (str == null) {
                        str = "";
                    }
                }
                MusicBrowseCategory musicBrowseCategory2 = this.A00;
                String str3 = musicBrowseCategory2.A06;
                if (str3 == null) {
                    str3 = musicBrowseCategory2.A00();
                }
                if (C14360o3.A0K(str3, "trending")) {
                    str3 = "For you";
                }
                C50669MYn c50669MYn = this.A09;
                nqp = new HMZ(A00, this.A02, musicProduct, userSession, this.A07, jPe, c50669MYn, str, str3, z);
                break;
            case 1:
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                nqp = new HMR(A00(R.layout.music_search_row_grouping, viewGroup), this.A05, this.A06);
                break;
            case 2:
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                nqp = new HMQ(A00(R.layout.music_search_row_grouping, viewGroup), this.A05, this.A06);
                break;
            case 3:
                int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                nqp = new HMN(LoadMoreButton.A00(this.A01, R.layout.music_search_row_empty_state, viewGroup));
                break;
            case 4:
            default:
                throw AbstractC166987dD.A1D(AnonymousClass001.A0O(MSV.A00(27), i));
            case 5:
                int i6 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                nqp = new HMP(A00(R.layout.music_search_row_search_keyword, viewGroup), this.A06);
                break;
            case 6:
                int i7 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                nqp = new C3OO(A00(R.layout.music_search_row_section_gap, viewGroup));
                break;
            case 7:
            case 9:
                int i8 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View A002 = A00(R.layout.music_search_row_preview, viewGroup);
                UserSession userSession2 = this.A05;
                JPe jPe2 = this.A06;
                boolean z2 = this.A0B;
                MusicProduct musicProduct2 = this.A03;
                C23031Ai A003 = AbstractC23021Ah.A00(userSession2);
                C50669MYn c50669MYn2 = this.A09;
                C50664MYh c50664MYh = this.A08;
                nqp = new C39172HMa(A002, this.A02, musicProduct2, userSession2, this.A07, jPe2, c50664MYh, c50669MYn2, A003, z2);
                break;
            case 8:
                int i9 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                nqp = new HMS(A00(R.layout.music_search_row_grouping, viewGroup), this.A05, this.A06);
                break;
            case 10:
                int i10 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                nqp = new HMU(A00(R.layout.music_search_row_artist_item, viewGroup), this.A06);
                break;
            case 11:
                int i11 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                nqp = new HMO(A00(R.layout.row_search_for_x, viewGroup));
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                int i12 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                nqp = new NQO(A00(R.layout.music_search_row_header, viewGroup));
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                int i13 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                nqp = new C3OO(A00(R.layout.music_search_mix_nux, viewGroup));
                break;
            case 14:
                int i14 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View A004 = A00(R.layout.music_playlist_spotlight_banner, viewGroup);
                JPe jPe3 = this.A06;
                nqp = new HMW(A004, this.A05, this.A07, jPe3);
                break;
            case Process.SIGTERM /* 15 */:
                int i15 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View A005 = A00(R.layout.music_search_row_preview, viewGroup);
                UserSession userSession3 = this.A05;
                JPe jPe4 = this.A06;
                boolean z3 = this.A0B;
                MusicProduct musicProduct3 = this.A03;
                C23031Ai A006 = AbstractC23021Ah.A00(userSession3);
                C50669MYn c50669MYn3 = this.A09;
                C50664MYh c50664MYh2 = this.A08;
                nqp = new HMX(A005, this.A02, musicProduct3, userSession3, this.A07, jPe4, c50664MYh2, c50669MYn3, A006, z3);
                break;
            case 16:
                int i16 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                nqp = new HMV(A00(R.layout.music_search_row_collection_header, viewGroup), this.A04, this.A05);
                break;
            case 17:
                int i17 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                nqp = new NQP(A00(R.layout.music_search_row_qp_footer, viewGroup), this.A04);
                break;
        }
        return nqp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (r4 < 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        r4 = 0;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(X.C3OO r12) {
        /*
            r11 = this;
            r9 = 0
            X.C14360o3.A0B(r12, r9)
            int r2 = r12.getBindingAdapterPosition()
            if (r2 < 0) goto L87
            int r0 = r11.getItemCount()
            int r0 = r0 + (-1)
            if (r2 > r0) goto L87
            java.lang.Object r1 = r11.getItem(r2)
            boolean r0 = r1 instanceof X.HML
            if (r0 == 0) goto L87
            X.HML r1 = (X.HML) r1
            if (r1 == 0) goto L87
            X.Goo r3 = r1.A00
            if (r3 == 0) goto L87
            X.JIN r1 = r3.A00()
            if (r1 == 0) goto L7e
            com.instagram.music.common.model.MusicBrowseCategory r4 = r11.A00
            java.lang.String r0 = r4.A06
            if (r0 != 0) goto L32
            java.lang.String r0 = r4.A00()
        L32:
            java.lang.String r4 = "trending"
            boolean r0 = X.C14360o3.A0K(r0, r4)
            if (r0 == 0) goto L8b
            r0 = 139(0x8b, float:1.95E-43)
            java.lang.String r6 = X.MSV.A00(r0)
        L40:
            com.instagram.music.common.model.MusicBrowseCategory r0 = r11.A00
            java.lang.String r7 = r0.A06
            if (r7 != 0) goto L4a
            java.lang.String r7 = r0.A00()
        L4a:
            boolean r0 = X.C14360o3.A0K(r7, r4)
            if (r0 == 0) goto L52
            java.lang.String r7 = "For you"
        L52:
            X.2xe r0 = r11.mDiffer
            java.util.List r0 = r0.A02
            X.C14360o3.A07(r0)
            java.util.Iterator r5 = r0.iterator()
            r4 = 0
        L5e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r5.next()
            boolean r0 = r0 instanceof X.HML
            if (r0 == 0) goto L88
            if (r4 >= r9) goto L6f
        L6e:
            r4 = 0
        L6f:
            int r10 = r2 - r4
            r5 = 0
            java.lang.String r8 = "full_list"
            X.ODq r4 = new X.ODq
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.JPe r0 = r11.A06
            r0.Dud(r1, r4)
        L7e:
            com.instagram.music.common.model.MusicSearchArtist r1 = r3.A0B
            if (r1 == 0) goto L87
            X.JPe r0 = r11.A06
            r0.Dj9(r1, r2)
        L87:
            return
        L88:
            int r4 = r4 + 1
            goto L5e
        L8b:
            com.instagram.music.common.model.MusicBrowseCategory r0 = r11.A00
            java.lang.String r6 = r0.A04
            if (r6 != 0) goto L40
            java.lang.String r6 = ""
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38067Gov.onViewAttachedToWindow(X.3OO):void");
    }

    private final View A00(int i, ViewGroup viewGroup) {
        LayoutInflater from;
        boolean z = this.A0D;
        Context context = this.A01;
        if (z) {
            from = LayoutInflater.from(context).cloneInContext(new ContextThemeWrapper(context, R.style.MusicCreationLightOverlayTheme));
        } else {
            from = LayoutInflater.from(context);
        }
        return AbstractC25226BEj.A0R(from, viewGroup, i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (X.C14360o3.A0K(r4.A00(), "top_trends") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e6, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36326227800110854L) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e8, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f3, code lost:
    
        if (X.C36A.A03(r17.A05) != false) goto L115;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r18, int r19) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38067Gov.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int A03 = C0f9.A03(2124394494);
        long A00 = this.A0C.A00(((ICV) getItem(i)).A00);
        C0f9.A0A(-1010717889, A03);
        return A00;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int A03 = C0f9.A03(-565194802);
        Object item = getItem(i);
        if (item instanceof HMA) {
            i2 = 5;
        } else if (item instanceof HM7) {
            i2 = 3;
        } else if (item instanceof HMB) {
            i2 = 17;
        } else if (item instanceof HM8) {
            i2 = 6;
        } else if (item instanceof HM9) {
            i2 = 12;
        } else if (item instanceof HMJ) {
            i2 = 0;
        } else if (item instanceof HMG) {
            i2 = 1;
        } else if (item instanceof HMF) {
            i2 = 2;
        } else if (item instanceof HMI) {
            i2 = 14;
        } else if (item instanceof HMH) {
            i2 = 8;
        } else if (item instanceof HMC) {
            i2 = 10;
        } else if (item instanceof HMD) {
            i2 = 9;
        } else if (item instanceof HME) {
            i2 = 16;
        } else if (item instanceof HMK) {
            i2 = 7;
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unknown search item type");
            C0f9.A0A(1368284855, A03);
            throw unsupportedOperationException;
        }
        C0f9.A0A(-1752503129, A03);
        return i2;
    }
}
