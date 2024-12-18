package X;

import com.google.common.collect.ImmutableList;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.visual.model.DirectVisualMessageItemModel;

/* loaded from: classes8.dex */
public final class LFF {
    public static final DirectVisualMessageItemModel A00(InterfaceC50520MRx interfaceC50520MRx, int i) {
        Long Ad4 = interfaceC50520MRx.Ad4(i);
        if (Ad4 != null) {
            long longValue = Ad4.longValue();
            Integer Ad6 = interfaceC50520MRx.Ad6(i);
            if (Ad6 != null) {
                int intValue = Ad6.intValue();
                android.net.Uri A00 = LHB.A00(interfaceC50520MRx.Ad1(i), null, longValue);
                android.net.Uri A002 = LHB.A00(interfaceC50520MRx.Ad5(i), null, longValue);
                String BSx = interfaceC50520MRx.BSx(i);
                String BtG = interfaceC50520MRx.BtG(i);
                long C8h = interfaceC50520MRx.C8h(i);
                boolean A1P = AbstractC167007dF.A1P(intValue, 4);
                Integer BSq = interfaceC50520MRx.BSq(i);
                if (BSq != null) {
                    return new DirectVisualMessageItemModel(new DirectVisualMessageItemModel.MediaFields.TamMedia(A00, A002), null, BSx, BtG, interfaceC50520MRx.BYZ(i), BSq.intValue(), C8h, A1P);
                }
                throw AbstractC166997dE.A0g();
            }
        }
        return null;
    }

    public final ImmutableList A01(MessagingUser messagingUser, InterfaceC50520MRx interfaceC50520MRx, int i) {
        Integer CGq;
        Integer CGq2;
        DirectVisualMessageItemModel A00;
        AbstractC167017dG.A1Q(interfaceC50520MRx, messagingUser);
        DirectVisualMessageItemModel A002 = A00(interfaceC50520MRx, i);
        if (A002 == null) {
            return null;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        if (!InterfaceC50520MRx.A02(messagingUser, interfaceC50520MRx, i) && (CGq = interfaceC50520MRx.CGq(i)) != null && CGq.intValue() == 0) {
            int count = interfaceC50520MRx.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                int count2 = (i2 + i) % interfaceC50520MRx.getCount();
                if (interfaceC50520MRx.BSl(count2) == 8 && interfaceC50520MRx.CGp(count2) && (CGq2 = interfaceC50520MRx.CGq(count2)) != null && CGq2.intValue() == 0 && !InterfaceC50520MRx.A02(messagingUser, interfaceC50520MRx, count2)) {
                    if (count2 == i) {
                        A00 = A002;
                    } else {
                        A00 = A00(interfaceC50520MRx, count2);
                    }
                    builder.add((Object) A00);
                }
            }
        } else {
            builder.add((Object) A002);
        }
        return builder.build();
    }
}
