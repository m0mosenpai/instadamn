package X;

import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.List;

/* loaded from: classes9.dex */
public final class P45 implements InterfaceC58204PrA {
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public BrandedContentGatingInfoIntf A07;
    public BrandedContentProjectMetadataIntf A08;
    public MediaCroppingCoordinates A09;
    public MediaCroppingCoordinates A0A;
    public IGTVShoppingMetadata A0B;
    public O80 A0C;
    public C54741OFs A0D;
    public NewFundraiserInfo A0E;
    public TaggingFeedMultiSelectState A0F;
    public ExistingStandaloneFundraiserForFeedModel A0G;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public String A0N = "";
    public String A0H = "";
    public List A0P = AbstractC166987dD.A1E();
    public int A06 = 100;
    public float A00 = 0.5625f;
    public final C2GS A0j = MSW.A0E();
    public List A0O = AbstractC166987dD.A1E();
    public boolean A0S = true;
    public boolean A0c = true;

    @Override // X.InterfaceC58204PrA
    public final void ERB(String str) {
        C14360o3.A0B(str, 0);
        this.A0H = str;
    }

    @Override // X.InterfaceC58204PrA
    public final void EbD(float f) {
        if (f == 0.0f) {
            C0w9.A03("IGTVUploadViewStateDelegate.resetViewModel", "aspectRatio cannot be zero");
        } else {
            this.A00 = f;
        }
    }

    @Override // X.InterfaceC58204PrA
    public final void setTitle(String str) {
        C14360o3.A0B(str, 0);
        this.A0N = str;
    }

    public final void A00(float f) {
        setTitle("");
        ERB("");
        this.A0P = AbstractC166987dD.A1E();
        this.A0I = null;
        this.A05 = 0;
        this.A06 = 100;
        EbD(f);
        this.A0d = false;
        this.A0Y = false;
        this.A0J = null;
        this.A04 = 0;
        this.A03 = 0;
        this.A02 = 0;
        this.A0Z = false;
        this.A09 = null;
        this.A0A = null;
        this.A0D = null;
        this.A0O = AbstractC166987dD.A1E();
        this.A0f = false;
        this.A07 = null;
        this.A08 = null;
        this.A0a = false;
        this.A0e = false;
        this.A0Q = false;
        this.A0R = false;
        this.A0X = false;
        this.A0S = true;
        this.A0V = false;
        this.A0T = false;
        this.A0U = false;
        this.A0M = null;
        this.A0h = false;
        this.A0B = null;
        this.A0F = null;
        this.A0E = null;
        this.A0G = null;
        this.A0L = null;
        this.A0i = false;
        this.A0b = false;
        this.A0C = null;
        this.A0K = null;
        this.A0g = false;
    }

    @Override // X.InterfaceC58204PrA
    public final boolean Aca() {
        return this.A0Q;
    }

    @Override // X.InterfaceC58204PrA
    public final boolean Acb() {
        return this.A0R;
    }

    @Override // X.InterfaceC58204PrA
    public final BrandedContentProjectMetadataIntf Ai4() {
        return this.A08;
    }

    @Override // X.InterfaceC58204PrA
    public final List Ai7() {
        return this.A0O;
    }

    @Override // X.InterfaceC58204PrA
    public final String Alc() {
        return this.A0H;
    }

    @Override // X.InterfaceC58204PrA
    public final int AsK() {
        return this.A02;
    }

    @Override // X.InterfaceC58204PrA
    public final int AsL() {
        return this.A03;
    }

    @Override // X.InterfaceC58204PrA
    public final int AsO() {
        return this.A04;
    }

    @Override // X.InterfaceC58204PrA
    public final boolean B2r() {
        return this.A0U;
    }

    @Override // X.InterfaceC58204PrA
    public final String B2w() {
        return this.A0L;
    }

    @Override // X.InterfaceC58204PrA
    public final MediaCroppingCoordinates B5v() {
        return this.A09;
    }

    @Override // X.InterfaceC58204PrA
    public final int B6Q() {
        return this.A05;
    }

    @Override // X.InterfaceC58204PrA
    public final int B6S() {
        return this.A06;
    }

    @Override // X.InterfaceC58204PrA
    public final BrandedContentGatingInfoIntf BQl() {
        return this.A07;
    }

    @Override // X.InterfaceC58204PrA
    public final NewFundraiserInfo BWi() {
        return this.A0E;
    }

    @Override // X.InterfaceC58204PrA
    public final List BcK() {
        return this.A0P;
    }

    @Override // X.InterfaceC58204PrA
    public final float Bes() {
        return this.A00;
    }

    @Override // X.InterfaceC58204PrA
    public final C54741OFs Bf0() {
        return this.A0D;
    }

    @Override // X.InterfaceC58204PrA
    public final C2GS Bf1() {
        return this.A0j;
    }

    @Override // X.InterfaceC58204PrA
    public final MediaCroppingCoordinates Bhh() {
        return this.A0A;
    }

    @Override // X.InterfaceC58204PrA
    public final boolean BuK() {
        return this.A0h;
    }

    @Override // X.InterfaceC58204PrA
    public final IGTVShoppingMetadata Buk() {
        return this.A0B;
    }

    @Override // X.InterfaceC58204PrA
    public final boolean CRp() {
        return this.A0Z;
    }

    @Override // X.InterfaceC58204PrA
    public final boolean CVG() {
        return this.A0a;
    }

    @Override // X.InterfaceC58204PrA
    public final boolean CXE() {
        return this.A0d;
    }

    @Override // X.InterfaceC58204PrA
    public final String getTitle() {
        return this.A0N;
    }

    @Override // X.InterfaceC58204PrA
    public final boolean isPaidPartnership() {
        return this.A0f;
    }

    @Override // X.InterfaceC58204PrA
    public final void EQV(BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf) {
        this.A08 = brandedContentProjectMetadataIntf;
    }

    @Override // X.InterfaceC58204PrA
    public final void EQW(List list) {
        this.A0O = list;
    }

    @Override // X.InterfaceC58204PrA
    public final void ESG(boolean z) {
        this.A0Y = z;
    }

    @Override // X.InterfaceC58204PrA
    public final void ESH(String str) {
        this.A0J = str;
    }

    @Override // X.InterfaceC58204PrA
    public final void ESI(boolean z) {
        this.A0Z = z;
    }

    @Override // X.InterfaceC58204PrA
    public final void ESJ(int i) {
        this.A02 = i;
    }

    @Override // X.InterfaceC58204PrA
    public final void ESK(int i) {
        this.A03 = i;
    }

    @Override // X.InterfaceC58204PrA
    public final void ESN(int i) {
        this.A04 = i;
    }

    @Override // X.InterfaceC58204PrA
    public final void EUX(int i) {
        this.A05 = i;
    }

    @Override // X.InterfaceC58204PrA
    public final void EUZ(int i) {
        this.A06 = i;
    }

    @Override // X.InterfaceC58204PrA
    public final void EWs(boolean z) {
        this.A0d = z;
    }

    @Override // X.InterfaceC58204PrA
    public final void EaU(boolean z) {
        this.A0f = z;
    }

    @Override // X.InterfaceC58204PrA
    public final void Eae(List list) {
        this.A0P = list;
    }

    @Override // X.InterfaceC58204PrA
    public final void Edr(boolean z) {
        this.A0h = z;
    }
}
