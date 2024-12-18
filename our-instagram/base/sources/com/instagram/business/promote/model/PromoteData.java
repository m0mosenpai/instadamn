package com.instagram.business.promote.model;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25231BEo;
import X.AbstractC31176DnK;
import X.AbstractC37304Gc5;
import X.AbstractC43593JPy;
import X.AbstractC65702TsY;
import X.AbstractC83893oY;
import X.C14360o3;
import X.C26031BfK;
import X.C38671GzC;
import X.C66634UQm;
import X.C70220WId;
import X.E71;
import X.EnumC39597He7;
import X.EnumC68189VFh;
import X.EnumC68198VFq;
import X.MUW;
import X.UPA;
import X.UPI;
import X.UQ6;
import X.XFA;
import X.XFK;
import X.XFQ;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.DEPProgramLevelContentResponse;
import com.instagram.api.schemas.DestinationRecommendationReason;
import com.instagram.api.schemas.Estimate;
import com.instagram.api.schemas.NonDiscInfo;
import com.instagram.api.schemas.PaymentInfo;
import com.instagram.api.schemas.XFBCTXWelcomeMessageStatus;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.model.AdCreativeAuthorizationCategory;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.model.mediatype.ProductType;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public class PromoteData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(68);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public C26031BfK A0M;
    public E71 A0N;
    public MUW A0O;
    public UQ6 A0P;
    public com.instagram.api.schemas.BillingWizardName A0Q;
    public DEPProgramLevelContentResponse A0R;
    public DestinationRecommendationReason A0S;
    public Estimate A0T;
    public Estimate A0U;
    public XFK A0V;
    public NonDiscInfo A0W;
    public PaymentInfo A0X;
    public UPA A0Y;
    public XFQ A0Z;
    public XFBCTXWelcomeMessageStatus A0a;
    public XIGIGBoostCallToAction A0b;
    public XIGIGBoostCallToAction A0c;
    public XIGIGBoostCallToAction A0d;
    public XIGIGBoostCallToAction A0e;
    public XIGIGBoostDestination A0f;
    public XIGIGBoostDestination A0g;
    public XIGIGBoostDestination A0h;
    public XIGIGBoostDestination A0i;
    public XIGIGBoostDestination A0j;
    public AdCreativeAuthorizationCategory A0k;
    public BoostFlowType A0l;
    public IGBoostPackagesFlowInfo A0m;
    public LinkingAuthState A0n;
    public PendingLocation A0o;
    public PromoteAudienceInfo A0p;
    public PromoteAudienceInfo A0q;
    public PromoteAudiencePotentialReachStore A0r;
    public PromoteDataSnapshot A0s;
    public PromoteEnrollCouponInfo A0t;
    public PromoteIntegrityCheckDataModel A0u;
    public PromoteLaunchOrigin A0v;
    public PromoteReachEstimationStore A0w;
    public PromoteWhatsAppAccountType A0x;
    public UserSession A0y;
    public ImageUrl A0z;
    public ImageUrl A10;
    public ImageUrl A11;
    public EnumC39597He7 A12;
    public EnumC68189VFh A13;
    public EnumC68198VFq A14;
    public EnumC68198VFq A15;
    public LeadForm A16;
    public ProductType A17;
    public AudioOverlayTrack A18;
    public Boolean A19;
    public String A1A;
    public String A1B;
    public String A1C;
    public String A1D;
    public String A1E;
    public String A1F;
    public String A1G;
    public String A1H;
    public String A1I;
    public String A1J;
    public String A1K;
    public String A1L;
    public String A1M;
    public String A1N;
    public String A1O;
    public String A1P;
    public String A1Q;
    public String A1R;
    public String A1S;
    public String A1T;
    public String A1U;
    public String A1V;
    public String A1W;
    public String A1X;
    public String A1Y;
    public String A1Z;
    public String A1a;
    public String A1b;
    public String A1c;
    public String A1d;
    public String A1e;
    public String A1f;
    public String A1g;
    public String A1h;
    public String A1i;
    public Currency A1j;
    public Date A1k;
    public List A1l;
    public List A1m;
    public List A1n;
    public List A1o;
    public List A1p;
    public List A1q;
    public List A1r;
    public List A1s;
    public List A1t;
    public List A1u;
    public List A1v;
    public List A1w;
    public List A1x;
    public List A1y;
    public List A1z;
    public List A20;
    public List A21;
    public Map A22;
    public Map A23;
    public Set A24;
    public Set A25;
    public Set A26;
    public Set A27;
    public boolean A28;
    public boolean A29;
    public boolean A2A;
    public boolean A2B;
    public boolean A2C;
    public boolean A2D;
    public boolean A2E;
    public boolean A2F;
    public boolean A2G;
    public boolean A2H;
    public boolean A2I;
    public boolean A2J;
    public boolean A2K;
    public boolean A2L;
    public boolean A2M;
    public boolean A2N;
    public boolean A2O;
    public boolean A2P;
    public boolean A2Q;
    public boolean A2R;
    public boolean A2S;
    public boolean A2T;
    public boolean A2U;
    public boolean A2V;
    public boolean A2W;
    public boolean A2X;
    public boolean A2Y;
    public boolean A2Z;
    public boolean A2a;
    public boolean A2b;
    public boolean A2c;
    public boolean A2d;
    public boolean A2e;
    public boolean A2f;
    public boolean A2g;
    public boolean A2h;
    public boolean A2i;
    public boolean A2j;
    public boolean A2k;
    public boolean A2l;
    public boolean A2m;
    public boolean A2n;
    public boolean A2o;
    public boolean A2p;
    public boolean A2q;
    public boolean A2r;
    public boolean A2s;
    public boolean A2t;
    public boolean A2u;
    public boolean A2v;
    public boolean A2w;
    public boolean A2x;
    public boolean A2y;
    public boolean A2z;
    public boolean A30;
    public boolean A31;
    public boolean A32;
    public boolean A33;
    public boolean A34;
    public boolean A35;
    public String[] A36;

    public static void A01(Parcel parcel, List list) {
        if (list == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, list);
        while (A0u.hasNext()) {
            C38671GzC c38671GzC = (C38671GzC) A0u.next();
            parcel.writeString(c38671GzC.A02);
            parcel.writeInt(AbstractC167017dG.A0K((Number) c38671GzC.A01));
            parcel.writeLong(c38671GzC.A00);
            parcel.writeString(c38671GzC.A03);
            parcel.writeString(c38671GzC.A04);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static void A02(PromoteData promoteData) {
        if (promoteData.A0i == XIGIGBoostDestination.A08) {
            List list = promoteData.A20;
            if (list == null || list.size() < 2) {
                promoteData.A20 = new ArrayList(Arrays.asList(XIGIGBoostDestination.A04, XIGIGBoostDestination.A0G));
            }
        }
    }

    public final ImmutableList A03() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A21.iterator();
        while (it.hasNext()) {
            AbstractC166997dE.A1S(it.next(), arrayList);
        }
        if (arrayList.isEmpty()) {
            return ImmutableList.of();
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public final PromoteAudience A06() {
        String str = this.A1Z;
        if (str != null) {
            Map map = this.A22;
            if (map.containsKey(str)) {
                return (PromoteAudience) map.get(str);
            }
            return null;
        }
        return null;
    }

    public final PromoteAudience A07() {
        String str = this.A1Z;
        if (str != null) {
            Map map = this.A22;
            if (map.containsKey(str)) {
                return (PromoteAudience) map.get(str);
            }
            return null;
        }
        return null;
    }

    public final PromoteAudience A08() {
        String str = this.A1Z;
        if (str != null && !AbstractC83893oY.A00(this.A1m)) {
            for (PromoteAudience promoteAudience : this.A1m) {
                String str2 = promoteAudience.A05;
                if (str2 != null && str2.equals(str)) {
                    return promoteAudience;
                }
            }
            return null;
        }
        return null;
    }

    public final ArrayList A0A() {
        boolean z = this.A32;
        if (!z && !this.A30) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            HashMap hashMap = new HashMap();
            hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "MULTI_ADVERTISERS_CONTEXTUAL_ADS");
            hashMap.put("eligibility", "ELIGIBLE");
            EnumC68198VFq enumC68198VFq = this.A15;
            enumC68198VFq.getClass();
            hashMap.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, enumC68198VFq.name());
            arrayList.add(hashMap);
        }
        if (!this.A30) {
            return arrayList;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "AUTOMATIC_CREATIVE_OPTIMIZATION");
        hashMap2.put("eligibility", "ELIGIBLE");
        EnumC68198VFq enumC68198VFq2 = this.A14;
        enumC68198VFq2.getClass();
        hashMap2.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, enumC68198VFq2.name());
        arrayList.add(hashMap2);
        return arrayList;
    }

    public final void A0B(int i) {
        if (!this.A1n.isEmpty()) {
            int A01 = AbstractC31176DnK.A01(this.A1n, 0);
            int abs = Math.abs(i - A01);
            Iterator it = this.A1n.iterator();
            while (it.hasNext()) {
                int A0B = AbstractC167007dF.A0B(it);
                int abs2 = Math.abs(i - A0B);
                if (abs2 > abs) {
                    break;
                }
                A01 = A0B;
                abs = abs2;
            }
            this.A08 = A01;
        }
    }

    public final boolean A0C() {
        if (!this.A21.contains(SpecialRequirementCategory.A06) && !this.A21.contains(SpecialRequirementCategory.A05) && !this.A21.contains(SpecialRequirementCategory.A04)) {
            return false;
        }
        return true;
    }

    public final boolean A0D() {
        if (this.A0v == PromoteLaunchOrigin.A02 && this.A1v.size() == 2) {
            return true;
        }
        return false;
    }

    public final boolean A0E() {
        Integer num;
        int intValue;
        int intValue2;
        PaymentInfo paymentInfo = this.A0X;
        if (paymentInfo == null || (num = paymentInfo.A01) == null || (intValue = num.intValue()) <= 0) {
            return false;
        }
        Integer num2 = paymentInfo.A02;
        if (num2 == null) {
            intValue2 = 0;
        } else {
            intValue2 = num2.intValue();
        }
        if ((intValue - intValue2) - this.A0I > 0) {
            return false;
        }
        return true;
    }

    public final boolean A0F(String str) {
        if (this.A1A != null && this.A0y != null && this.A1S != null && str != null && this.A0i != null && this.A1Z != null && this.A0I > 0) {
            if ((this.A0A > 0 || this.A2w) && this.A07 > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.A1S);
        parcel.writeStringList(this.A1v);
        parcel.writeParcelable(this.A0m, i);
        parcel.writeInt(this.A0H);
        parcel.writeParcelable(this.A17, i);
        parcel.writeParcelable(this.A0l, i);
        parcel.writeParcelable(this.A11, i);
        parcel.writeStringList(this.A1w);
        parcel.writeString(this.A1A);
        parcel.writeString(this.A1B);
        parcel.writeString(this.A1Q);
        parcel.writeString(this.A1R);
        parcel.writeParcelable(this.A10, i);
        parcel.writeString(this.A1K);
        parcel.writeString(this.A1L);
        parcel.writeByte(this.A2u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2K ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A28 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A32 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A30 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2T ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.A0i, i);
        parcel.writeParcelable(this.A0g, i);
        parcel.writeParcelable(this.A0f, i);
        parcel.writeParcelable(this.A0h, i);
        parcel.writeParcelable(this.A0j, i);
        parcel.writeTypedList(this.A20);
        parcel.writeParcelable(this.A0S, i);
        parcel.writeString(this.A1I);
        parcel.writeString(this.A1W);
        parcel.writeParcelable(this.A0b, i);
        parcel.writeParcelable(this.A0c, i);
        parcel.writeTypedList(this.A1m);
        parcel.writeByte(this.A2e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2U ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A1Z);
        parcel.writeString(this.A1V);
        parcel.writeString(this.A1X);
        parcel.writeString(this.A1b);
        parcel.writeParcelable(this.A18, i);
        Iterator A0s = AbstractC167017dG.A0s(parcel, this.A22);
        while (A0s.hasNext()) {
            parcel.writeParcelable((Parcelable) AbstractC167027dH.A0O(parcel, A0s), i);
        }
        parcel.writeSerializable(this.A1j);
        parcel.writeInt(this.A06);
        parcel.writeByte(this.A2P ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2S ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2R ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2Q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2G ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2H ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeList(this.A1n);
        parcel.writeList(this.A1y);
        parcel.writeList(this.A1o);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A0I);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A09);
        parcel.writeByte(this.A2w ? (byte) 1 : (byte) 0);
        Date date = this.A1k;
        if (date != null) {
            parcel.writeLong(date.getTime());
        }
        parcel.writeParcelable(this.A0u, i);
        parcel.writeString(this.A1F);
        parcel.writeInt(this.A04);
        parcel.writeByte(this.A2s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2d ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.A1r);
        parcel.writeTypedList(this.A1x);
        parcel.writeTypedList(this.A1p);
        parcel.writeByte(this.A2o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A34 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A1U);
        C26031BfK c26031BfK = this.A0M;
        if (c26031BfK == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeFloat(c26031BfK.A00);
        }
        parcel.writeParcelable(this.A0X, i);
        parcel.writeParcelable(this.A0W, i);
        parcel.writeString(this.A1H);
        parcel.writeByte(this.A2D ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.A0t, i);
        parcel.writeByte(this.A33 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2x ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.A0w, i);
        parcel.writeByte(this.A2p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2Y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2v ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.A1q);
        parcel.writeTypedList(new ArrayList(this.A24));
        parcel.writeParcelable(this.A0x, i);
        parcel.writeParcelable(this.A0k, i);
        parcel.writeByte(this.A2t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2l ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.A0U, i);
        parcel.writeParcelable(this.A0T, i);
        parcel.writeParcelable(this.A0q, i);
        parcel.writeParcelable(this.A0p, i);
        parcel.writeString(this.A1J);
        Boolean bool = this.A19;
        if (bool == null) {
            i2 = 0;
        } else {
            i2 = 2;
            if (bool.booleanValue()) {
                i2 = 1;
            }
        }
        parcel.writeByte((byte) i2);
        parcel.writeByte(this.A2a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.A0R, i);
        A01(parcel, this.A1l);
        parcel.writeString(this.A1c);
        parcel.writeParcelable(this.A0v, i);
        UPA upa = this.A0Y;
        if (upa == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            List list = upa.A04;
            if (list == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                Iterator A0u = AbstractC25231BEo.A0u(parcel, list);
                while (A0u.hasNext()) {
                    C66634UQm c66634UQm = (C66634UQm) ((XFA) A0u.next());
                    parcel.writeString(c66634UQm.A00);
                    parcel.writeString(c66634UQm.A01);
                }
            }
            parcel.writeString(upa.A02);
            UPI upi = upa.A00;
            if (upi == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                parcel.writeString(upi.A02);
                A01(parcel, upi.A06);
                parcel.writeString(upi.A03);
                parcel.writeParcelable(upi.A01, i);
                parcel.writeString(upi.A04);
                parcel.writeString(upi.A05);
                parcel.writeParcelable(upi.A00, i);
            }
            parcel.writeParcelable(upa.A01, i);
            parcel.writeString(upa.A03);
        }
        parcel.writeByte(this.A2y ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A1T);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A0D);
        parcel.writeInt(this.A0G);
        parcel.writeInt(this.A0E);
        parcel.writeParcelable(this.A0o, i);
        parcel.writeParcelable(this.A0r, i);
        Map map = this.A23;
        if (map != null) {
            parcel.writeByte((byte) 1);
            Iterator A0s2 = AbstractC167017dG.A0s(parcel, map);
            while (A0s2.hasNext()) {
                Map.Entry entry = (Map.Entry) A0s2.next();
                parcel.writeInt(((Number) entry.getKey()).intValue());
                parcel.writeInt(AbstractC43593JPy.A04(entry));
            }
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeInt(this.A05);
        parcel.writeByte(this.A2X ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A1P);
        parcel.writeByte(this.A2g ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.A0Q, i);
        parcel.writeString(this.A1E);
        parcel.writeString(this.A1Y);
        parcel.writeByte(this.A2h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2Z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2J ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A31 ? (byte) 1 : (byte) 0);
        EnumC68189VFh enumC68189VFh = this.A13;
        if (enumC68189VFh != null) {
            parcel.writeByte((byte) 1);
            parcel.writeString(enumC68189VFh.toString());
        } else {
            parcel.writeByte((byte) 0);
        }
        EnumC68198VFq enumC68198VFq = this.A15;
        if (enumC68198VFq != null) {
            parcel.writeByte((byte) 1);
            parcel.writeString(enumC68198VFq.toString());
        } else {
            parcel.writeByte((byte) 0);
        }
        EnumC68198VFq enumC68198VFq2 = this.A14;
        if (enumC68198VFq2 != null) {
            parcel.writeByte((byte) 1);
            parcel.writeString(enumC68198VFq2.toString());
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeParcelable(this.A0n, i);
        parcel.writeByte(this.A2b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2I ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2L ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.A0s, i);
        parcel.writeByte(this.A2W ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2q ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A1C);
        parcel.writeString(this.A1D);
        parcel.writeParcelable(this.A0a, i);
        parcel.writeList(this.A21);
        parcel.writeByte(this.A2V ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(new ArrayList(this.A26));
        parcel.writeString(this.A1a);
        parcel.writeString(this.A1G);
        parcel.writeByte(this.A29 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2c ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(new ArrayList(this.A25));
        parcel.writeByte(this.A2C ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A1d);
        parcel.writeString(this.A1g);
        parcel.writeString(this.A1e);
        parcel.writeString(this.A1h);
        parcel.writeString(this.A1f);
        parcel.writeString(this.A1i);
        parcel.writeSerializable(this.A12);
        parcel.writeByte(this.A2z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A2M ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A35 ? (byte) 1 : (byte) 0);
    }

    public PromoteData() {
        AbstractC65702TsY.A1N(this);
        AbstractC65702TsY.A1O(this);
        this.A1C = null;
        this.A1D = null;
        this.A25 = new HashSet();
        this.A2C = false;
        this.A2z = false;
        this.A2M = false;
        this.A35 = false;
    }

    public static ArrayList A00(Parcel parcel) {
        if (parcel.readByte() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            String readString = parcel.readString();
            arrayList.add(new C38671GzC(AbstractC37304Gc5.A0U(parcel), readString, parcel.readString(), parcel.readString(), parcel.readLong()));
        }
        return arrayList;
    }

    public final Estimate A04(String str) {
        int i;
        if (A0F(str)) {
            PromoteReachEstimationStore promoteReachEstimationStore = this.A0w;
            String str2 = this.A1S;
            XIGIGBoostDestination xIGIGBoostDestination = this.A0i;
            xIGIGBoostDestination.getClass();
            String obj = xIGIGBoostDestination.toString();
            String str3 = this.A1Z;
            str3.getClass();
            boolean z = this.A2f;
            boolean z2 = this.A2s;
            if (this.A2w) {
                i = this.A07;
            } else {
                i = this.A0I;
            }
            AbstractC167017dG.A1N(str2, obj);
            if (C14360o3.A0K(promoteReachEstimationStore.A03, str2) && C14360o3.A0K(promoteReachEstimationStore.A02, obj) && C14360o3.A0K(promoteReachEstimationStore.A01, str3) && promoteReachEstimationStore.A06 == z && promoteReachEstimationStore.A07 == z2) {
                return (Estimate) AbstractC166997dE.A0m(promoteReachEstimationStore.A04, i);
            }
            return null;
        }
        return null;
    }

    public final Estimate A05(String str) {
        int i;
        if (A0F(str)) {
            PromoteReachEstimationStore promoteReachEstimationStore = this.A0w;
            String str2 = this.A1S;
            XIGIGBoostDestination xIGIGBoostDestination = this.A0i;
            xIGIGBoostDestination.getClass();
            String obj = xIGIGBoostDestination.toString();
            String str3 = this.A1Z;
            str3.getClass();
            boolean z = this.A2f;
            boolean z2 = this.A2s;
            if (this.A2w) {
                i = this.A07;
            } else {
                i = this.A0I;
            }
            AbstractC167027dH.A12(str2, obj, str);
            if (C14360o3.A0K(promoteReachEstimationStore.A03, str2) && C14360o3.A0K(promoteReachEstimationStore.A02, obj) && C14360o3.A0K(promoteReachEstimationStore.A00, str) && C14360o3.A0K(promoteReachEstimationStore.A01, str3) && promoteReachEstimationStore.A06 == z && promoteReachEstimationStore.A07 == z2) {
                return (Estimate) AbstractC166997dE.A0m(promoteReachEstimationStore.A05, i);
            }
            return null;
        }
        return null;
    }

    public final String A09() {
        A02(this);
        if (AbstractC83893oY.A00(this.A20)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.A20.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toString());
        }
        return jSONArray.toString();
    }
}
