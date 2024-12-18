package com.instagram.rtc.signaling.models;

import X.AET;
import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC41350IRv;
import X.AnonymousClass001;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import X.EnumC53137Neq;
import X.EnumC53138Ner;
import X.EnumC53186Nfi;
import X.MSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.video.common.events.IgRtcEventHeader;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public interface RtcConnectionEntity extends Parcelable {

    /* loaded from: classes4.dex */
    public final class EndCallConnectionEntity extends C0T6 implements RtcConnectionEntity {
        public static final Parcelable.Creator CREATOR = new C37324GcR(43);
        public final EnumC53137Neq A00;
        public final RtcIgNotification A01;
        public final EnumC53186Nfi A02;
        public final Integer A03;
        public final Integer A04;
        public final Integer A05;
        public final Long A06;
        public final String A07;
        public final String A08;
        public final String A09;
        public final String A0A;
        public final String A0B;
        public final String A0C;
        public final String A0D;
        public final String A0E;
        public final String A0F;
        public final boolean A0G;
        public final boolean A0H;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof EndCallConnectionEntity) {
                    EndCallConnectionEntity endCallConnectionEntity = (EndCallConnectionEntity) obj;
                    if (this.A02 != endCallConnectionEntity.A02 || !C14360o3.A0K(this.A0C, endCallConnectionEntity.A0C) || this.A05 != endCallConnectionEntity.A05 || this.A03 != endCallConnectionEntity.A03 || !C14360o3.A0K(this.A0B, endCallConnectionEntity.A0B) || !C14360o3.A0K(this.A01, endCallConnectionEntity.A01) || !C14360o3.A0K(this.A06, endCallConnectionEntity.A06) || !C14360o3.A0K(this.A0D, endCallConnectionEntity.A0D) || !C14360o3.A0K(this.A0E, endCallConnectionEntity.A0E) || !C14360o3.A0K(this.A0F, endCallConnectionEntity.A0F) || !C14360o3.A0K(this.A08, endCallConnectionEntity.A08) || !C14360o3.A0K(this.A09, endCallConnectionEntity.A09) || !C14360o3.A0K(this.A07, endCallConnectionEntity.A07) || !C14360o3.A0K(this.A0A, endCallConnectionEntity.A0A) || this.A0H != endCallConnectionEntity.A0H || !C14360o3.A0K(this.A04, endCallConnectionEntity.A04) || this.A00 != endCallConnectionEntity.A00 || this.A0G != endCallConnectionEntity.A0G) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            AbstractC166997dE.A1I(parcel, this.A02);
            parcel.writeString(this.A0C);
            parcel.writeString(AET.A01(this.A05));
            parcel.writeString(AbstractC41350IRv.A01(this.A03));
            parcel.writeString(this.A0B);
            parcel.writeParcelable(this.A01, i);
            Long l = this.A06;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            parcel.writeString(this.A0D);
            parcel.writeString(this.A0E);
            parcel.writeString(this.A0F);
            parcel.writeString(this.A08);
            parcel.writeString(this.A09);
            parcel.writeString(this.A07);
            parcel.writeString(this.A0A);
            parcel.writeInt(this.A0H ? 1 : 0);
            AbstractC167027dH.A0o(parcel, this.A04, 0, 1);
            AbstractC166997dE.A1I(parcel, this.A00);
            parcel.writeInt(this.A0G ? 1 : 0);
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final /* synthetic */ RtcCallKey Ajm() {
            return new RtcCallKey(this.A0D);
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String BXN() {
            return this.A0B;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final Integer BXQ() {
            return this.A03;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String Bl4() {
            return this.A0C;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final RtcIgNotification Bpo() {
            return this.A01;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String Bta() {
            return this.A0D;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final Integer BxM() {
            return this.A05;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final EnumC53186Nfi C01() {
            return this.A02;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String C7I() {
            return this.A0F;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final Long CA5() {
            return this.A06;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String getTag() {
            return this.A0E;
        }

        public final int hashCode() {
            int A0K = AbstractC166997dE.A0K(this.A0C, AbstractC166987dD.A0G(this.A02));
            Integer num = this.A05;
            int A0L = AbstractC167017dG.A0L(num, AET.A01(num), A0K);
            Integer num2 = this.A03;
            return AbstractC166987dD.A0K(this.A0G, AbstractC166997dE.A0J(this.A00, (AbstractC167007dF.A0D(this.A0H, (((((((((AbstractC166997dE.A0K(this.A0E, AbstractC166997dE.A0K(this.A0D, (((((AbstractC167017dG.A0L(num2, AbstractC41350IRv.A01(num2), A0L) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31)) + AbstractC167017dG.A0O(this.A0F)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC166997dE.A0I(this.A04)) * 31));
        }

        public EndCallConnectionEntity(EnumC53137Neq enumC53137Neq, RtcIgNotification rtcIgNotification, EnumC53186Nfi enumC53186Nfi, Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2) {
            AbstractC167017dG.A1P(enumC53186Nfi, str);
            AbstractC167007dF.A1J(str3, 8, str4);
            C14360o3.A0B(enumC53137Neq, 17);
            this.A02 = enumC53186Nfi;
            this.A0C = str;
            this.A05 = num;
            this.A03 = num2;
            this.A0B = str2;
            this.A01 = rtcIgNotification;
            this.A06 = l;
            this.A0D = str3;
            this.A0E = str4;
            this.A0F = str5;
            this.A08 = str6;
            this.A09 = str7;
            this.A07 = str8;
            this.A0A = str9;
            this.A0H = z;
            this.A04 = num3;
            this.A00 = enumC53137Neq;
            this.A0G = z2;
        }
    }

    /* loaded from: classes4.dex */
    public final class LiveInviteConnectionEntity extends C0T6 implements RtcConnectionEntity {
        public static final Parcelable.Creator CREATOR = new C37324GcR(44);
        public final ImageUrl A00;
        public final RtcIgNotification A01;
        public final EnumC53186Nfi A02;
        public final Integer A03;
        public final Integer A04;
        public final Long A05;
        public final String A06;
        public final String A07;
        public final String A08;
        public final String A09;
        public final String A0A;
        public final String A0B;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof LiveInviteConnectionEntity) {
                    LiveInviteConnectionEntity liveInviteConnectionEntity = (LiveInviteConnectionEntity) obj;
                    if (this.A02 != liveInviteConnectionEntity.A02 || !C14360o3.A0K(this.A08, liveInviteConnectionEntity.A08) || this.A04 != liveInviteConnectionEntity.A04 || this.A03 != liveInviteConnectionEntity.A03 || !C14360o3.A0K(this.A07, liveInviteConnectionEntity.A07) || !C14360o3.A0K(this.A01, liveInviteConnectionEntity.A01) || !C14360o3.A0K(this.A05, liveInviteConnectionEntity.A05) || !C14360o3.A0K(this.A09, liveInviteConnectionEntity.A09) || !C14360o3.A0K(this.A0A, liveInviteConnectionEntity.A0A) || !C14360o3.A0K(this.A0B, liveInviteConnectionEntity.A0B) || !C14360o3.A0K(this.A06, liveInviteConnectionEntity.A06) || !C14360o3.A0K(this.A00, liveInviteConnectionEntity.A00)) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            AbstractC166997dE.A1I(parcel, this.A02);
            parcel.writeString(this.A08);
            parcel.writeString(AET.A01(this.A04));
            parcel.writeString(AbstractC41350IRv.A01(this.A03));
            parcel.writeString(this.A07);
            parcel.writeParcelable(this.A01, i);
            AbstractC167027dH.A0n(parcel, this.A05);
            parcel.writeString(this.A09);
            parcel.writeString(this.A0A);
            parcel.writeString(this.A0B);
            parcel.writeString(this.A06);
            parcel.writeParcelable(this.A00, i);
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final /* synthetic */ RtcCallKey Ajm() {
            return new RtcCallKey(this.A09);
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String BXN() {
            return this.A07;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final Integer BXQ() {
            return this.A03;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String Bl4() {
            return this.A08;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final RtcIgNotification Bpo() {
            return this.A01;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String Bta() {
            return this.A09;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final Integer BxM() {
            return this.A04;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final EnumC53186Nfi C01() {
            return this.A02;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String C7I() {
            return this.A0B;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final Long CA5() {
            return this.A05;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String getTag() {
            return this.A0A;
        }

        public final int hashCode() {
            int A0K = AbstractC166997dE.A0K(this.A08, AbstractC166987dD.A0G(this.A02));
            Integer num = this.A04;
            int A0L = AbstractC167017dG.A0L(num, AET.A01(num), A0K);
            Integer num2 = this.A03;
            return AbstractC166997dE.A0K(this.A06, (AbstractC166997dE.A0K(this.A0A, AbstractC166997dE.A0K(this.A09, (((((AbstractC167017dG.A0L(num2, AbstractC41350IRv.A01(num2), A0L) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31)) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC166997dE.A0I(this.A00);
        }

        public LiveInviteConnectionEntity(ImageUrl imageUrl, RtcIgNotification rtcIgNotification, EnumC53186Nfi enumC53186Nfi, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5, String str6) {
            AbstractC167017dG.A1P(enumC53186Nfi, str);
            AbstractC167007dF.A1J(str3, 8, str4);
            C14360o3.A0B(str6, 11);
            this.A02 = enumC53186Nfi;
            this.A08 = str;
            this.A04 = num;
            this.A03 = num2;
            this.A07 = str2;
            this.A01 = rtcIgNotification;
            this.A05 = l;
            this.A09 = str3;
            this.A0A = str4;
            this.A0B = str5;
            this.A06 = str6;
            this.A00 = imageUrl;
        }
    }

    /* loaded from: classes4.dex */
    public final class RtcCallConnectionEntity extends C0T6 implements RtcConnectionEntity {
        public static final Parcelable.Creator CREATOR = new C37324GcR(45);
        public final long A00;
        public final EnumC53137Neq A01;
        public final EnumC53138Ner A02;
        public final RtcCallKey A03;
        public final RtcIgNotification A04;
        public final EnumC53186Nfi A05;
        public final IgRtcEventHeader A06;
        public final Integer A07;
        public final Integer A08;
        public final Long A09;
        public final String A0A;
        public final String A0B;
        public final String A0C;
        public final String A0D;
        public final String A0E;
        public final String A0F;
        public final String A0G;
        public final String A0H;
        public final String A0I;
        public final String A0J;
        public final String A0K;
        public final boolean A0L;
        public final boolean A0M;
        public final boolean A0N;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof RtcCallConnectionEntity) {
                    RtcCallConnectionEntity rtcCallConnectionEntity = (RtcCallConnectionEntity) obj;
                    if (this.A05 != rtcCallConnectionEntity.A05 || !C14360o3.A0K(this.A0G, rtcCallConnectionEntity.A0G) || this.A08 != rtcCallConnectionEntity.A08 || this.A07 != rtcCallConnectionEntity.A07 || !C14360o3.A0K(this.A0F, rtcCallConnectionEntity.A0F) || !C14360o3.A0K(this.A04, rtcCallConnectionEntity.A04) || !C14360o3.A0K(this.A09, rtcCallConnectionEntity.A09) || !C14360o3.A0K(this.A0H, rtcCallConnectionEntity.A0H) || !C14360o3.A0K(this.A0I, rtcCallConnectionEntity.A0I) || !C14360o3.A0K(this.A0J, rtcCallConnectionEntity.A0J) || !C14360o3.A0K(this.A0K, rtcCallConnectionEntity.A0K) || !C14360o3.A0K(this.A0B, rtcCallConnectionEntity.A0B) || !C14360o3.A0K(this.A0C, rtcCallConnectionEntity.A0C) || !C14360o3.A0K(this.A0A, rtcCallConnectionEntity.A0A) || !C14360o3.A0K(this.A0D, rtcCallConnectionEntity.A0D) || !C14360o3.A0K(this.A0E, rtcCallConnectionEntity.A0E) || this.A01 != rtcCallConnectionEntity.A01 || this.A0M != rtcCallConnectionEntity.A0M || this.A02 != rtcCallConnectionEntity.A02 || this.A0L != rtcCallConnectionEntity.A0L || this.A0N != rtcCallConnectionEntity.A0N || !C14360o3.A0K(this.A06, rtcCallConnectionEntity.A06) || !C14360o3.A0K(this.A03, rtcCallConnectionEntity.A03)) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            AbstractC166997dE.A1I(parcel, this.A05);
            parcel.writeString(this.A0G);
            parcel.writeString(AET.A01(this.A08));
            parcel.writeString(AbstractC41350IRv.A01(this.A07));
            parcel.writeString(this.A0F);
            parcel.writeParcelable(this.A04, i);
            AbstractC167027dH.A0n(parcel, this.A09);
            parcel.writeString(this.A0H);
            parcel.writeString(this.A0I);
            parcel.writeString(this.A0J);
            parcel.writeString(this.A0K);
            parcel.writeString(this.A0B);
            parcel.writeString(this.A0C);
            parcel.writeString(this.A0A);
            parcel.writeString(this.A0D);
            parcel.writeString(this.A0E);
            AbstractC166997dE.A1I(parcel, this.A01);
            parcel.writeInt(this.A0M ? 1 : 0);
            AbstractC166997dE.A1I(parcel, this.A02);
            parcel.writeInt(this.A0L ? 1 : 0);
            parcel.writeInt(this.A0N ? 1 : 0);
            parcel.writeParcelable(this.A06, i);
            parcel.writeParcelable(this.A03, i);
        }

        public final String A00() {
            if (this.A01 != EnumC53137Neq.A03 && !this.A0M) {
                return this.A0E;
            }
            return this.A0J;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final RtcCallKey Ajm() {
            return this.A03;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String BXN() {
            return this.A0F;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final Integer BXQ() {
            return this.A07;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String Bl4() {
            return this.A0G;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final RtcIgNotification Bpo() {
            return this.A04;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String Bta() {
            return this.A0H;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final Integer BxM() {
            return this.A08;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final EnumC53186Nfi C01() {
            return this.A05;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String C7I() {
            return this.A0J;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final Long CA5() {
            return this.A09;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String getTag() {
            return this.A0I;
        }

        public final int hashCode() {
            int A0K = AbstractC166997dE.A0K(this.A0G, AbstractC166987dD.A0G(this.A05));
            Integer num = this.A08;
            int A0L = AbstractC167017dG.A0L(num, AET.A01(num), A0K);
            Integer num2 = this.A07;
            return AbstractC166987dD.A0I(this.A03, (AbstractC167007dF.A0D(this.A0N, AbstractC167007dF.A0D(this.A0L, AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A0M, AbstractC166997dE.A0J(this.A01, (((((((AbstractC166997dE.A0K(this.A0B, (((AbstractC166997dE.A0K(this.A0I, AbstractC166997dE.A0K(this.A0H, (((((AbstractC167017dG.A0L(num2, AbstractC41350IRv.A01(num2), A0L) + AbstractC167017dG.A0O(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31)) + AbstractC167017dG.A0O(this.A0J)) * 31) + AbstractC167017dG.A0O(this.A0K)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31))))) + AbstractC166997dE.A0I(this.A06)) * 31);
        }

        public RtcCallConnectionEntity(EnumC53137Neq enumC53137Neq, EnumC53138Ner enumC53138Ner, RtcCallKey rtcCallKey, RtcIgNotification rtcIgNotification, EnumC53186Nfi enumC53186Nfi, IgRtcEventHeader igRtcEventHeader, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2, boolean z3) {
            AbstractC167017dG.A1P(enumC53186Nfi, str);
            AbstractC167007dF.A1J(str3, 8, str4);
            C14360o3.A0B(str7, 12);
            C14360o3.A0B(enumC53137Neq, 17);
            C14360o3.A0B(enumC53138Ner, 19);
            C14360o3.A0B(rtcCallKey, 23);
            this.A05 = enumC53186Nfi;
            this.A0G = str;
            this.A08 = num;
            this.A07 = num2;
            this.A0F = str2;
            this.A04 = rtcIgNotification;
            this.A09 = l;
            this.A0H = str3;
            this.A0I = str4;
            this.A0J = str5;
            this.A0K = str6;
            this.A0B = str7;
            this.A0C = str8;
            this.A0A = str9;
            this.A0D = str10;
            this.A0E = str11;
            this.A01 = enumC53137Neq;
            this.A0M = z;
            this.A02 = enumC53138Ner;
            this.A0L = z2;
            this.A0N = z3;
            this.A06 = igRtcEventHeader;
            this.A03 = rtcCallKey;
            this.A00 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }

        public final String toString() {
            String str;
            String str2;
            String str3;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("RtcCallConnectionEntity(state=");
            A1C.append(this.A05);
            A1C.append(MSV.A00(637));
            A1C.append(this.A0G);
            A1C.append(", signalingProtocol=");
            Integer num = this.A08;
            if (num != null) {
                str = AET.A01(num);
            } else {
                str = "null";
            }
            A1C.append(str);
            A1C.append(AbstractC111324zv.A00(3412));
            Integer num2 = this.A07;
            if (num2 != null) {
                switch (num2.intValue()) {
                    case 1:
                        str3 = "mqtt";
                        break;
                    case 2:
                        str3 = NetInfoModule.CONNECTION_TYPE_NONE;
                        break;
                    default:
                        str3 = "normal";
                        break;
                }
                str2 = AnonymousClass001.A0R("call notification push type: ", str3);
            } else {
                str2 = "null";
            }
            A1C.append(str2);
            A1C.append(", notificationMessage=");
            A1C.append(this.A0F);
            A1C.append(", rtcIgNotification=");
            A1C.append(this.A04);
            A1C.append(", traceId=");
            A1C.append(this.A09);
            A1C.append(AbstractC111324zv.A00(1451));
            A1C.append(this.A0H);
            A1C.append(", tag=");
            A1C.append(this.A0I);
            A1C.append(MSV.A00(136));
            A1C.append(this.A0J);
            A1C.append(AbstractC111324zv.A00(1459));
            A1C.append(this.A0K);
            A1C.append(", callerId=");
            A1C.append(this.A0B);
            A1C.append(", callerName=");
            A1C.append(this.A0C);
            A1C.append(MSV.A00(617));
            A1C.append(this.A0A);
            A1C.append(", displayUri=");
            A1C.append(this.A0D);
            A1C.append(", msgrThreadId=");
            A1C.append(this.A0E);
            A1C.append(MSV.A00(624));
            A1C.append(this.A01);
            A1C.append(", isE2eeOverInstamadillo=");
            A1C.append(this.A0M);
            A1C.append(MSV.A00(625));
            A1C.append(this.A02);
            A1C.append(MSV.A00(630));
            A1C.append(this.A0L);
            A1C.append(MSV.A00(632));
            A1C.append(this.A0N);
            A1C.append(", rtcMessageEventHeader=");
            A1C.append(this.A06);
            A1C.append(", callKey=");
            return AbstractC167017dG.A0o(this.A03, A1C);
        }
    }

    /* loaded from: classes4.dex */
    public final class RtcCallGenericConnectionEntity extends C0T6 implements RtcConnectionEntity {
        public static final Parcelable.Creator CREATOR = new C37324GcR(46);
        public final RtcIgNotification A00;
        public final EnumC53186Nfi A01;
        public final Integer A02;
        public final Integer A03;
        public final Long A04;
        public final String A05;
        public final String A06;
        public final String A07;
        public final String A08;
        public final String A09;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof RtcCallGenericConnectionEntity) {
                    RtcCallGenericConnectionEntity rtcCallGenericConnectionEntity = (RtcCallGenericConnectionEntity) obj;
                    if (this.A01 != rtcCallGenericConnectionEntity.A01 || !C14360o3.A0K(this.A06, rtcCallGenericConnectionEntity.A06) || this.A03 != rtcCallGenericConnectionEntity.A03 || this.A02 != rtcCallGenericConnectionEntity.A02 || !C14360o3.A0K(this.A05, rtcCallGenericConnectionEntity.A05) || !C14360o3.A0K(this.A00, rtcCallGenericConnectionEntity.A00) || !C14360o3.A0K(this.A04, rtcCallGenericConnectionEntity.A04) || !C14360o3.A0K(this.A07, rtcCallGenericConnectionEntity.A07) || !C14360o3.A0K(this.A08, rtcCallGenericConnectionEntity.A08) || !C14360o3.A0K(this.A09, rtcCallGenericConnectionEntity.A09)) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            AbstractC166997dE.A1I(parcel, this.A01);
            parcel.writeString(this.A06);
            parcel.writeString(AET.A01(this.A03));
            parcel.writeString(AbstractC41350IRv.A01(this.A02));
            parcel.writeString(this.A05);
            parcel.writeParcelable(this.A00, i);
            AbstractC167027dH.A0n(parcel, this.A04);
            parcel.writeString(this.A07);
            parcel.writeString(this.A08);
            parcel.writeString(this.A09);
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final /* synthetic */ RtcCallKey Ajm() {
            return new RtcCallKey(this.A07);
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String BXN() {
            return this.A05;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final Integer BXQ() {
            return this.A02;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String Bl4() {
            return this.A06;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final RtcIgNotification Bpo() {
            return this.A00;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String Bta() {
            return this.A07;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final Integer BxM() {
            return this.A03;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final EnumC53186Nfi C01() {
            return this.A01;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String C7I() {
            return this.A09;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final Long CA5() {
            return this.A04;
        }

        @Override // com.instagram.rtc.signaling.models.RtcConnectionEntity
        public final String getTag() {
            return this.A08;
        }

        public final int hashCode() {
            int A0K = AbstractC166997dE.A0K(this.A06, AbstractC166987dD.A0G(this.A01));
            Integer num = this.A03;
            int A0L = AbstractC167017dG.A0L(num, AET.A01(num), A0K);
            Integer num2 = this.A02;
            int A0L2 = AbstractC167017dG.A0L(num2, AbstractC41350IRv.A01(num2), A0L);
            int i = 0;
            int A0K2 = AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0K(this.A07, (((((A0L2 + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31));
            String str = this.A09;
            if (str != null) {
                i = str.hashCode();
            }
            return A0K2 + i;
        }

        public RtcCallGenericConnectionEntity(RtcIgNotification rtcIgNotification, EnumC53186Nfi enumC53186Nfi, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5) {
            AbstractC167017dG.A1P(enumC53186Nfi, str);
            AbstractC167007dF.A1J(str3, 8, str4);
            this.A01 = enumC53186Nfi;
            this.A06 = str;
            this.A03 = num;
            this.A02 = num2;
            this.A05 = str2;
            this.A00 = rtcIgNotification;
            this.A04 = l;
            this.A07 = str3;
            this.A08 = str4;
            this.A09 = str5;
        }
    }

    RtcCallKey Ajm();

    String BXN();

    Integer BXQ();

    String Bl4();

    RtcIgNotification Bpo();

    String Bta();

    Integer BxM();

    EnumC53186Nfi C01();

    String C7I();

    Long CA5();

    String getTag();
}
