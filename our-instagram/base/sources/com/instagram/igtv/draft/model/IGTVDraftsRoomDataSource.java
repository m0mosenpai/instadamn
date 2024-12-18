package com.instagram.igtv.draft.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC28241Yh;
import X.AbstractC37591ow;
import X.AbstractC43594JPz;
import X.AbstractC73723Sa;
import X.C00O;
import X.C0eB;
import X.C14360o3;
import X.C16930sl;
import X.C1JX;
import X.C1Ye;
import X.C2Q9;
import X.C37581ov;
import X.C51649Mrg;
import X.C51661Mrs;
import X.C51667Mry;
import X.C51669Ms0;
import X.C51682MsD;
import X.C51715Msk;
import X.C51737MtK;
import X.CallableC43825JZn;
import X.CallableC72062XMf;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.InterfaceC58196Pr2;
import X.MSW;
import X.MV5;
import X.MXO;
import X.MXP;
import X.PUL;
import X.PUT;
import android.graphics.RectF;
import android.os.CancellationSignal;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.persistence.IGTVDatabase;
import com.instagram.igtv.persistence.IGTVDatabase_Impl;
import com.instagram.igtv.persistence.draft.IGTVBrandedContentTags;
import com.instagram.roomdb.IgRoomDatabase;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes9.dex */
public final class IGTVDraftsRoomDataSource implements InterfaceC58196Pr2 {
    public final MXP A00;

    public IGTVDraftsRoomDataSource(UserSession userSession) {
        MXP mxp;
        C14360o3.A0B(userSession, 1);
        MXO mxo = IGTVDatabase.A08;
        IgRoomDatabase A0p = MSW.A0p(userSession, IGTVDatabase.class);
        if (A0p == null) {
            synchronized (mxo) {
                A0p = MSW.A0p(userSession, IGTVDatabase.class);
                if (A0p == null) {
                    C1Ye A0K = AbstractC43594JPz.A0K(userSession, mxo, IGTVDatabase.class);
                    AbstractC28241Yh.A00(A0K, 823, 824, false);
                    A0K.A02(Arrays.copyOf(IGTVDatabase.A09, 6));
                    A0K.A05 = true;
                    A0K.A03 = true;
                    A0K.A03(IGTVDatabase.A05, IGTVDatabase.A06, IGTVDatabase.A07, IGTVDatabase.A00, IGTVDatabase.A01, IGTVDatabase.A02, IGTVDatabase.A03, IGTVDatabase.A04);
                    A0p = (IgRoomDatabase) A0K.A00();
                    userSession.A04(IGTVDatabase.class, A0p);
                }
            }
        }
        IGTVDatabase_Impl iGTVDatabase_Impl = (IGTVDatabase_Impl) ((IGTVDatabase) A0p);
        if (iGTVDatabase_Impl.A00 != null) {
            mxp = iGTVDatabase_Impl.A00;
        } else {
            synchronized (iGTVDatabase_Impl) {
                if (iGTVDatabase_Impl.A00 == null) {
                    iGTVDatabase_Impl.A00 = new MXP(iGTVDatabase_Impl);
                }
                mxp = iGTVDatabase_Impl.A00;
            }
        }
        this.A00 = mxp;
    }

    public static final C51649Mrg A00(C51682MsD c51682MsD) {
        List list;
        BrandedContentProjectMetadata brandedContentProjectMetadata;
        int i = c51682MsD.A06;
        long j = c51682MsD.A0A;
        C51667Mry c51667Mry = new C51667Mry(c51682MsD.A0M, c51682MsD.A08, c51682MsD.A09, c51682MsD.A07, c51682MsD.A0B);
        String str = c51682MsD.A0L;
        String str2 = c51682MsD.A0I;
        C51737MtK A0d = AbstractC25225BEi.A0d(c51682MsD.A04, c51682MsD.A05, 19);
        C51661Mrs c51661Mrs = new C51661Mrs(0, c51682MsD.A00, c51682MsD.A0T);
        C51669Ms0 c51669Ms0 = new C51669Ms0(c51682MsD.A0H, c51682MsD.A03, c51682MsD.A02, c51682MsD.A01, c51682MsD.A0P, c51682MsD.A0Q);
        boolean z = c51682MsD.A0W;
        RectF rectF = c51682MsD.A0D;
        RectF rectF2 = c51682MsD.A0E;
        boolean z2 = c51682MsD.A0S;
        String str3 = c51682MsD.A0J;
        boolean z3 = c51682MsD.A0a;
        boolean z4 = c51682MsD.A0N;
        boolean z5 = c51682MsD.A0O;
        boolean z6 = c51682MsD.A0R;
        boolean z7 = c51682MsD.A0V;
        IGTVBrandedContentTags iGTVBrandedContentTags = c51682MsD.A0F;
        if (iGTVBrandedContentTags != null) {
            list = iGTVBrandedContentTags.A01;
            if (list == null) {
                C14360o3.A0F("brandedContentTags");
                throw C00O.createAndThrow();
            }
        } else {
            list = C16930sl.A00;
        }
        if (iGTVBrandedContentTags != null) {
            brandedContentProjectMetadata = iGTVBrandedContentTags.A00;
        } else {
            brandedContentProjectMetadata = null;
        }
        return new C51649Mrg(rectF, rectF2, A0d, c51661Mrs, new C51715Msk(brandedContentProjectMetadata, list, z4, z5, z6, z7, c51682MsD.A0Z, c51682MsD.A0U), c51669Ms0, c51667Mry, c51682MsD.A0G, str, str2, str3, c51682MsD.A0K, i, j, z, z2, z3, c51682MsD.A0X);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, com.instagram.igtv.persistence.draft.IGTVBrandedContentTags] */
    public static final C51682MsD A01(C51649Mrg c51649Mrg, int i) {
        BrandedContentProjectMetadata brandedContentProjectMetadata;
        C51667Mry c51667Mry = c51649Mrg.A08;
        String str = c51667Mry.A04;
        int i2 = c51667Mry.A01;
        int i3 = c51667Mry.A02;
        int i4 = c51667Mry.A00;
        long j = c51667Mry.A03;
        String str2 = c51649Mrg.A0D;
        String str3 = c51649Mrg.A0A;
        String str4 = c51649Mrg.A0C;
        boolean z = c51649Mrg.A0G;
        C51737MtK c51737MtK = c51649Mrg.A04;
        int i5 = c51737MtK.A00;
        int i6 = c51737MtK.A01;
        C51661Mrs c51661Mrs = c51649Mrg.A05;
        float f = c51661Mrs.A00;
        boolean z2 = c51661Mrs.A02;
        C51669Ms0 c51669Ms0 = c51649Mrg.A07;
        boolean z3 = c51669Ms0.A04;
        String str5 = c51669Ms0.A03;
        int i7 = c51669Ms0.A02;
        int i8 = c51669Ms0.A01;
        int i9 = c51669Ms0.A00;
        boolean z4 = c51669Ms0.A05;
        boolean z5 = c51649Mrg.A0F;
        RectF rectF = c51649Mrg.A02;
        RectF rectF2 = c51649Mrg.A03;
        boolean z6 = c51649Mrg.A0E;
        String str6 = c51649Mrg.A0B;
        boolean z7 = c51649Mrg.A0H;
        C51715Msk c51715Msk = c51649Mrg.A06;
        boolean z8 = c51715Msk.A03;
        boolean z9 = c51715Msk.A04;
        boolean z10 = c51715Msk.A06;
        boolean z11 = c51715Msk.A05;
        boolean z12 = c51715Msk.A07;
        List list = (List) c51715Msk.A02;
        BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf = (BrandedContentProjectMetadataIntf) c51715Msk.A01;
        if (brandedContentProjectMetadataIntf != null) {
            brandedContentProjectMetadata = brandedContentProjectMetadataIntf.ErO();
        } else {
            brandedContentProjectMetadata = null;
        }
        C14360o3.A0B(list, 1);
        ?? obj = new Object();
        obj.A01 = list;
        obj.A00 = brandedContentProjectMetadata;
        return new C51682MsD(rectF, rectF2, obj, c51649Mrg.A09, str, str2, str3, str4, str5, str6, f, i, i2, i3, i4, i5, i6, i7, i8, i9, j, c51649Mrg.A01, System.currentTimeMillis(), false, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, c51715Msk.A08);
    }

    @Override // X.InterfaceC58196Pr2
    public final Object A8J(C51649Mrg c51649Mrg, InterfaceC23621Ds interfaceC23621Ds) {
        MXP mxp = this.A00;
        Object A01 = C2Q9.A01(mxp.A02, new PUL(9, mxp, A01(c51649Mrg, 0)), interfaceC23621Ds);
        if (A01 != C1JX.A02) {
            return C0eB.A00;
        }
        return A01;
    }

    @Override // X.InterfaceC58196Pr2
    public final Object AOd(int i, InterfaceC23621Ds interfaceC23621Ds) {
        MXP mxp = this.A00;
        Object A01 = C2Q9.A01(mxp.A02, new PUT(mxp, i, 2), interfaceC23621Ds);
        if (A01 != C1JX.A02) {
            return C0eB.A00;
        }
        return A01;
    }

    @Override // X.InterfaceC58196Pr2
    public final Object AOe(List list, InterfaceC23621Ds interfaceC23621Ds) {
        MXP mxp = this.A00;
        Object A01 = C2Q9.A01(mxp.A02, new CallableC43825JZn(14, mxp, list), interfaceC23621Ds);
        if (A01 != C1JX.A02) {
            return C0eB.A00;
        }
        return A01;
    }

    @Override // X.InterfaceC58196Pr2
    public final InterfaceC19390xP Ab9() {
        MXP mxp = this.A00;
        TreeMap treeMap = C37581ov.A08;
        return MV5.A00(this, C2Q9.A02(mxp.A02, new CallableC72062XMf(10, AbstractC37591ow.A00("SELECT * FROM drafts WHERE is_uploading = 0 ORDER BY last_modified_timestamp DESC", 0), mxp), new String[]{"drafts"}, false), 6);
    }

    @Override // X.InterfaceC58196Pr2
    public final Object AsI(int i, InterfaceC23621Ds interfaceC23621Ds) {
        MXP mxp = this.A00;
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT cover_image_file_path FROM drafts WHERE id = ?", 1);
        A00.ADi(1, i);
        return C2Q9.A00(new CancellationSignal(), mxp.A02, new PUL(7, mxp, A00), interfaceC23621Ds, false);
    }

    @Override // X.InterfaceC58196Pr2
    public final Object AsJ(List list, InterfaceC23621Ds interfaceC23621Ds) {
        MXP mxp = this.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SELECT cover_image_file_path FROM drafts WHERE id in (");
        int size = list.size();
        AbstractC73723Sa.A00(A1C, size);
        String A0x = AbstractC166997dE.A0x(")", A1C);
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00(A0x, size);
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            A00.ADi(i, AbstractC167007dF.A0B(it));
            i++;
        }
        return C2Q9.A00(new CancellationSignal(), mxp.A02, new PUL(8, mxp, A00), interfaceC23621Ds, false);
    }

    @Override // X.InterfaceC58196Pr2
    public final InterfaceC19390xP AzE(int i) {
        MXP mxp = this.A00;
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT * FROM drafts WHERE id = ?", 1);
        A00.ADi(1, i);
        return MV5.A00(this, C2Q9.A02(mxp.A02, new CallableC72062XMf(12, A00, mxp), new String[]{"drafts"}, false), 7);
    }

    @Override // X.InterfaceC58196Pr2
    public final Object BY7(InterfaceC23621Ds interfaceC23621Ds) {
        MXP mxp = this.A00;
        TreeMap treeMap = C37581ov.A08;
        return C2Q9.A00(new CancellationSignal(), mxp.A02, new PUL(6, mxp, AbstractC37591ow.A00("SELECT COUNT(*) FROM drafts WHERE is_uploading = 1", 0)), interfaceC23621Ds, false);
    }

    @Override // X.InterfaceC58196Pr2
    public final InterfaceC19390xP CDH(long j) {
        MXP mxp = this.A00;
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT * FROM drafts WHERE is_uploading = 1 AND last_modified_timestamp < ?", 1);
        A00.ADi(1, j);
        return MV5.A00(this, C2Q9.A02(mxp.A02, new CallableC72062XMf(11, A00, mxp), new String[]{"drafts"}, false), 8);
    }

    @Override // X.InterfaceC58196Pr2
    public final Object FAo(C51649Mrg c51649Mrg, InterfaceC23621Ds interfaceC23621Ds) {
        MXP mxp = this.A00;
        Object A01 = C2Q9.A01(mxp.A02, new PUL(10, mxp, A01(c51649Mrg, c51649Mrg.A00)), interfaceC23621Ds);
        if (A01 != C1JX.A02) {
            return C0eB.A00;
        }
        return A01;
    }

    @Override // X.InterfaceC58196Pr2
    public final Object FBG(InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        MXP mxp = this.A00;
        Object A01 = C2Q9.A01(mxp.A02, new PUT(mxp, i, 3), interfaceC23621Ds);
        if (A01 != C1JX.A02) {
            return C0eB.A00;
        }
        return A01;
    }
}
