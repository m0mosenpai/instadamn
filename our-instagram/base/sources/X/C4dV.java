package X;

import com.instagram.api.schemas.FeedItemType;
import com.instagram.api.schemas.TIXUDesignTypeEnum;
import com.instagram.api.schemas.ThreadsInFeedUnitTypeEnum;
import java.util.List;

/* renamed from: X.4dV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4dV implements InterfaceC73233Pz {
    public final InterfaceC99474dM A00;
    public final InterfaceC99474dM A01;
    public final InterfaceC99524dS A02;
    public final C99534dT A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final List A0A;

    public C4dV(C99534dT c99534dT) {
        Integer num;
        Integer num2;
        this.A03 = c99534dT;
        String str = c99534dT.A0C;
        this.A08 = str == null ? "" : str;
        List list = c99534dT.A0E;
        this.A09 = list == null ? C16930sl.A00 : list;
        ThreadsInFeedUnitTypeEnum threadsInFeedUnitTypeEnum = c99534dT.A06;
        if (threadsInFeedUnitTypeEnum != null && threadsInFeedUnitTypeEnum.ordinal() == 2) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        this.A04 = num;
        String str2 = c99534dT.A0A;
        this.A06 = str2 == null ? "tifu_dev_unit" : str2;
        this.A07 = c99534dT.A0B;
        this.A01 = c99534dT.A03;
        this.A00 = c99534dT.A02;
        this.A0A = c99534dT.A0F;
        this.A02 = c99534dT.A04;
        TIXUDesignTypeEnum tIXUDesignTypeEnum = c99534dT.A05;
        if (tIXUDesignTypeEnum != null && tIXUDesignTypeEnum.ordinal() == 2) {
            num2 = C05F.A00;
        } else {
            num2 = C05F.A01;
        }
        this.A05 = num2;
    }

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        String str;
        C1XV c1xv;
        FeedItemType feedItemType = this.A03.A00;
        if (feedItemType == null || (str = feedItemType.A00) == null || (c1xv = (C1XV) C1XV.A01.get(str)) == null) {
            return C1XV.A0z;
        }
        return c1xv;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return this.A03.A07;
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        return this.A03.A01;
    }

    @Override // X.InterfaceC73233Pz
    public final /* synthetic */ Integer BWa() {
        return null;
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        return this.A03.A0D;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A0N;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        return this.A03.A08;
    }

    @Override // X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return this.A03.A09;
    }
}
