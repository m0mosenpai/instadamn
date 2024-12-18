package X;

import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;

/* loaded from: classes9.dex */
public class OFO {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final NewFundraiserInfo A05;
    public final InterfaceC58160PqP A06;
    public final OCX A07;
    public final ExistingStandaloneFundraiserForFeedModel A08;
    public final InterfaceC43578JMm A09;

    public OFO(InterfaceC43578JMm interfaceC43578JMm, NewFundraiserInfo newFundraiserInfo, InterfaceC58160PqP interfaceC58160PqP, OCX ocx, ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel, int i) {
        this.A05 = newFundraiserInfo;
        this.A09 = interfaceC43578JMm;
        this.A08 = existingStandaloneFundraiserForFeedModel;
        this.A06 = interfaceC58160PqP;
        this.A07 = ocx;
        this.A04 = i;
        this.A00 = 8;
        this.A01 = 8;
        this.A02 = 8;
        this.A03 = 8;
        if (newFundraiserInfo == null && existingStandaloneFundraiserForFeedModel == null) {
            this.A00 = 0;
            this.A03 = 0;
        } else {
            this.A01 = 0;
            this.A02 = 0;
            this.A03 = 8;
        }
    }
}
