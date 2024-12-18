package com.instagram.settings.privacy.messages;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.AnonymousClass001;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class DirectMessagesInteropOptionsViewModel extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(61);
    public DirectMessageInteropReachabilityOptions A00;
    public DirectMessageInteropReachabilityOptions A01;
    public DirectMessageInteropReachabilityOptions A02;
    public DirectMessageInteropReachabilityOptions A03;
    public DirectMessageInteropReachabilityOptions A04;
    public DirectMessageInteropReachabilityOptions A05;
    public DirectMessageInteropReachabilityOptions A06;
    public DirectMessageInteropReachabilityOptions A07;
    public DirectMessageInteropReachabilityOptions A08;
    public DirectMessageInteropReachabilityOptions A09;

    public DirectMessagesInteropOptionsViewModel() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    public final DirectMessageInteropReachabilityOptions A00(String str) {
        C14360o3.A0B(str, 0);
        switch (str.hashCode()) {
            case -2143256302:
                if (str.equals("fb_friends")) {
                    return this.A00;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0g("DirectConstants.MessageInteropOption ", str, " not implemented"));
            case -1890055046:
                if (str.equals("fb_friends_of_friends")) {
                    return this.A01;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0g("DirectConstants.MessageInteropOption ", str, " not implemented"));
            case -1839818691:
                if (str.equals("people_with_your_phone_number")) {
                    return this.A09;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0g("DirectConstants.MessageInteropOption ", str, " not implemented"));
            case -1275916548:
                if (str.equals("fb_messaged_your_page")) {
                    return this.A03;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0g("DirectConstants.MessageInteropOption ", str, " not implemented"));
            case -737267292:
                if (str.equals("eligible_for_bc_partnership")) {
                    return null;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0g("DirectConstants.MessageInteropOption ", str, " not implemented"));
            case -456614348:
                if (str.equals("ig_followers")) {
                    return this.A05;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0g("DirectConstants.MessageInteropOption ", str, " not implemented"));
            case -371252023:
                if (str.equals("ig_verified")) {
                    return this.A06;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0g("DirectConstants.MessageInteropOption ", str, " not implemented"));
            case -8227469:
                if (str.equals("fb_liked_or_followed_your_page")) {
                    return this.A02;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0g("DirectConstants.MessageInteropOption ", str, " not implemented"));
            case 949752640:
                if (str.equals("others_on_fb")) {
                    return this.A07;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0g("DirectConstants.MessageInteropOption ", str, " not implemented"));
            case 949752738:
                if (str.equals("others_on_ig")) {
                    return this.A08;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0g("DirectConstants.MessageInteropOption ", str, " not implemented"));
            case 1767124056:
                if (str.equals("group_message_setting")) {
                    return this.A04;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0g("DirectConstants.MessageInteropOption ", str, " not implemented"));
            default:
                throw AbstractC166987dD.A12(AnonymousClass001.A0g("DirectConstants.MessageInteropOption ", str, " not implemented"));
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectMessagesInteropOptionsViewModel) {
                DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel = (DirectMessagesInteropOptionsViewModel) obj;
                if (this.A05 != directMessagesInteropOptionsViewModel.A05 || this.A00 != directMessagesInteropOptionsViewModel.A00 || this.A01 != directMessagesInteropOptionsViewModel.A01 || this.A09 != directMessagesInteropOptionsViewModel.A09 || this.A08 != directMessagesInteropOptionsViewModel.A08 || this.A07 != directMessagesInteropOptionsViewModel.A07 || this.A03 != directMessagesInteropOptionsViewModel.A03 || this.A02 != directMessagesInteropOptionsViewModel.A02 || this.A04 != directMessagesInteropOptionsViewModel.A04 || this.A06 != directMessagesInteropOptionsViewModel.A06) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC50523MSb.A0l(parcel, this.A05, i);
        AbstractC50523MSb.A0l(parcel, this.A00, i);
        AbstractC50523MSb.A0l(parcel, this.A01, i);
        AbstractC50523MSb.A0l(parcel, this.A09, i);
        AbstractC50523MSb.A0l(parcel, this.A08, i);
        AbstractC50523MSb.A0l(parcel, this.A07, i);
        AbstractC50523MSb.A0l(parcel, this.A03, i);
        AbstractC50523MSb.A0l(parcel, this.A02, i);
        AbstractC50523MSb.A0l(parcel, this.A04, i);
        AbstractC50523MSb.A0l(parcel, this.A06, i);
    }

    public final int hashCode() {
        return (((((((((((((((((AbstractC167017dG.A0M(this.A05) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A06);
    }

    public DirectMessagesInteropOptionsViewModel(DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions4, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions5, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions6, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions7, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions8, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions9, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions10) {
        this.A05 = directMessageInteropReachabilityOptions;
        this.A00 = directMessageInteropReachabilityOptions2;
        this.A01 = directMessageInteropReachabilityOptions3;
        this.A09 = directMessageInteropReachabilityOptions4;
        this.A08 = directMessageInteropReachabilityOptions5;
        this.A07 = directMessageInteropReachabilityOptions6;
        this.A03 = directMessageInteropReachabilityOptions7;
        this.A02 = directMessageInteropReachabilityOptions8;
        this.A04 = directMessageInteropReachabilityOptions9;
        this.A06 = directMessageInteropReachabilityOptions10;
    }
}
