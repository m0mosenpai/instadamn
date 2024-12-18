package X;

import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* renamed from: X.Iol, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42323Iol implements InterfaceC66482zP {
    public final C38665Gz6 A00;
    public final IHL A01;
    public final String A02;

    public C42323Iol(InterfaceC11380iw interfaceC11380iw, C69749Vuj c69749Vuj, C5QE c5qe, ImageInfo imageInfo, C41219IMi c41219IMi, String str, List list, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        AbstractC167007dF.A1I(c5qe, 2, list);
        C38665Gz6 c38665Gz6 = new C38665Gz6(c69749Vuj, c5qe, imageInfo, list, z, z2);
        IHL ihl = new IHL(interfaceC11380iw, c41219IMi, interfaceC16660sJ);
        this.A02 = str;
        this.A00 = c38665Gz6;
        this.A01 = ihl;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C38665Gz6 c38665Gz6;
        C42323Iol c42323Iol = (C42323Iol) obj;
        C38665Gz6 c38665Gz62 = this.A00;
        if (c42323Iol != null) {
            c38665Gz6 = c42323Iol.A00;
        } else {
            c38665Gz6 = null;
        }
        return C14360o3.A0K(c38665Gz62, c38665Gz6);
    }
}
