package com.instagram.ar.features.effectspage.models;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25651Mw;
import X.C05F;
import X.C0T6;
import X.C14360o3;
import X.C25671My;
import X.C70220WId;
import X.EnumC77213d7;
import X.InterfaceC38391qT;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Collection;

/* loaded from: classes7.dex */
public final class EffectsPageModel extends C0T6 implements InterfaceC38391qT, Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(7);
    public String A00;
    public boolean A01;
    public boolean A02;
    public final EffectAttribution A03;
    public final ImageUrl A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final String A0K;
    public final boolean A0L;

    @Override // X.InterfaceC38391qT
    public final void Ed3(EnumC77213d7 enumC77213d7) {
        C14360o3.A0B(enumC77213d7, 0);
        this.A02 = AbstractC167007dF.A1X(enumC77213d7, EnumC77213d7.A04);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EffectsPageModel) {
                EffectsPageModel effectsPageModel = (EffectsPageModel) obj;
                if (!C14360o3.A0K(this.A09, effectsPageModel.A09) || !C14360o3.A0K(this.A0A, effectsPageModel.A0A) || !C14360o3.A0K(this.A04, effectsPageModel.A04) || !C14360o3.A0K(this.A05, effectsPageModel.A05) || !C14360o3.A0K(this.A0D, effectsPageModel.A0D) || !C14360o3.A0K(this.A0B, effectsPageModel.A0B) || !C14360o3.A0K(this.A0K, effectsPageModel.A0K) || !C14360o3.A0K(this.A0E, effectsPageModel.A0E) || !C14360o3.A0K(this.A00, effectsPageModel.A00) || this.A0G != effectsPageModel.A0G || this.A0J != effectsPageModel.A0J || !C14360o3.A0K(this.A08, effectsPageModel.A08) || this.A02 != effectsPageModel.A02 || this.A01 != effectsPageModel.A01 || !C14360o3.A0K(this.A03, effectsPageModel.A03) || !C14360o3.A0K(this.A07, effectsPageModel.A07) || this.A0H != effectsPageModel.A0H || this.A0L != effectsPageModel.A0L || this.A0I != effectsPageModel.A0I || !C14360o3.A0K(this.A0C, effectsPageModel.A0C) || !C14360o3.A0K(this.A06, effectsPageModel.A06) || this.A0F != effectsPageModel.A0F) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A04, i);
        AbstractC167027dH.A0o(parcel, this.A05, 0, 1);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        AbstractC167027dH.A0o(parcel, this.A08, 0, 1);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeParcelable(this.A03, i);
        AbstractC167027dH.A0o(parcel, this.A07, 0, 1);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeString(this.A0C);
        AbstractC167027dH.A0o(parcel, this.A06, 0, 1);
        parcel.writeInt(this.A0F ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.8B8, java.lang.Object, X.1vN] */
    @Override // X.InterfaceC38391qT
    public final void AEH(AbstractC12990ll abstractC12990ll) {
        String str;
        EnumC77213d7 enumC77213d7;
        if (abstractC12990ll != null && (str = this.A0D) != null) {
            C25671My A00 = AbstractC25651Mw.A00(abstractC12990ll);
            if (this.A02) {
                enumC77213d7 = EnumC77213d7.A04;
            } else {
                enumC77213d7 = EnumC77213d7.A03;
            }
            ?? obj = new Object();
            obj.A01 = str;
            obj.A00 = enumC77213d7;
            A00.E4s(obj);
        }
    }

    @Override // X.InterfaceC38391qT
    public final EnumC77213d7 BqJ() {
        if (this.A02) {
            return EnumC77213d7.A04;
        }
        return EnumC77213d7.A03;
    }

    @Override // X.InterfaceC38391qT
    public final String BqK() {
        String str = this.A0D;
        if (str == null) {
            str = this.A0B;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC38391qT
    public final Integer BqO() {
        return C05F.A0N;
    }

    @Override // X.InterfaceC38391qT
    public final boolean CcN() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0F, (((AbstractC167007dF.A0D(this.A0I, AbstractC167007dF.A0D(this.A0L, AbstractC167007dF.A0D(this.A0H, (((AbstractC167007dF.A0D(this.A01, AbstractC167007dF.A0D(this.A02, (AbstractC167007dF.A0D(this.A0J, AbstractC167007dF.A0D(this.A0G, (AbstractC166997dE.A0K(this.A0E, AbstractC166997dE.A0K(this.A0K, (((((((AbstractC166997dE.A0K(this.A0A, AbstractC166987dD.A0J(this.A09)) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31)) + AbstractC167017dG.A0O(this.A00)) * 31)) + AbstractC167017dG.A0M(this.A08)) * 31)) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31))) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC166997dE.A0I(this.A06)) * 31);
    }

    public EffectsPageModel(EffectAttribution effectAttribution, ImageUrl imageUrl, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        AbstractC167017dG.A1P(str, str2);
        AbstractC167007dF.A1I(str5, 7, str6);
        this.A09 = str;
        this.A0A = str2;
        this.A04 = imageUrl;
        this.A05 = num;
        this.A0D = str3;
        this.A0B = str4;
        this.A0K = str5;
        this.A0E = str6;
        this.A00 = str7;
        this.A0G = z;
        this.A0J = z2;
        this.A08 = num2;
        this.A02 = z3;
        this.A01 = z4;
        this.A03 = effectAttribution;
        this.A07 = num3;
        this.A0H = z5;
        this.A0L = z6;
        this.A0I = z7;
        this.A0C = str8;
        this.A06 = num4;
        this.A0F = z8;
    }

    @Override // X.InterfaceC38391qT
    public final Collection BqL() {
        return AbstractC166987dD.A1E();
    }
}
