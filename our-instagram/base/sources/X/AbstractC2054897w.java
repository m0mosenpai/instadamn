package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.direct.threadkey.impl.MsysPendingRecipient;
import com.instagram.model.direct.threadkey.util.ThreadIdParcelable;
import com.instagram.model.direct.threadkey.util.ThreadTargetParcelable;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;

/* renamed from: X.97w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2054897w {
    public static final void A03(Parcel parcel, InterfaceC83713oG interfaceC83713oG, int i) {
        if (interfaceC83713oG != null) {
            if (interfaceC83713oG instanceof C163787Us) {
                parcel.writeInt(3);
                C163787Us c163787Us = (C163787Us) interfaceC83713oG;
                A03(parcel, c163787Us.A00, i);
                A03(parcel, c163787Us.A01, i);
                return;
            }
            if (interfaceC83713oG instanceof InterfaceC83733oI) {
                parcel.writeInt(0);
                InterfaceC83733oI interfaceC83733oI = (InterfaceC83733oI) interfaceC83713oG;
                C14360o3.A0B(interfaceC83733oI, 1);
                parcel.writeParcelable(new ThreadIdParcelable(interfaceC83733oI), i);
                return;
            }
            if (interfaceC83713oG instanceof C122145g6) {
                parcel.writeInt(1);
                parcel.writeList(((C122145g6) interfaceC83713oG).A00);
                return;
            } else {
                if (interfaceC83713oG instanceof C23974Ak9) {
                    parcel.writeInt(2);
                    C23974Ak9 c23974Ak9 = (C23974Ak9) interfaceC83713oG;
                    parcel.writeList(c23974Ak9.A02);
                    parcel.writeString(c23974Ak9.A00.A00);
                    parcel.writeInt(c23974Ak9.A01.A00);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected ThreadTarget: ");
                sb.append(interfaceC83713oG);
                throw new IllegalStateException(sb.toString());
            }
        }
        throw new IllegalStateException("null ThreadTarget");
    }

    public static final void A02(Bundle bundle, InterfaceC83713oG interfaceC83713oG, String str) {
        bundle.putParcelable(str, new ThreadTargetParcelable(interfaceC83713oG));
    }

    public static final InterfaceC83713oG A00(Bundle bundle, String str) {
        ThreadTargetParcelable threadTargetParcelable = (ThreadTargetParcelable) bundle.getParcelable(str);
        if (threadTargetParcelable != null) {
            return threadTargetParcelable.A00;
        }
        return null;
    }

    public static final InterfaceC83713oG A01(Parcel parcel) {
        InterfaceC83713oG interfaceC83713oG;
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt != 1) {
                if (readInt != 2) {
                    if (readInt == 3) {
                        InterfaceC83713oG A01 = A01(parcel);
                        C14360o3.A0C(A01, AbstractC43591JPw.A00(86));
                        InterfaceC83713oG A012 = A01(parcel);
                        C14360o3.A0C(A012, AbstractC43591JPw.A00(1211));
                        interfaceC83713oG = new C163787Us((InterfaceC83703oF) A01, (InterfaceC2056098k) A012);
                    } else {
                        throw new IllegalStateException(MSV.A00(867));
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    parcel.readList(arrayList, MsysPendingRecipient.class.getClassLoader());
                    String readString = parcel.readString();
                    if (readString == null) {
                        readString = EnumC92794Ds.A04.A00;
                    }
                    C14360o3.A0A(readString);
                    interfaceC83713oG = new C23974Ak9(AbstractC46863Knw.A00(readString), AbstractC46878KoL.A00(Integer.valueOf(parcel.readInt())), arrayList);
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                parcel.readList(arrayList2, PendingRecipient.class.getClassLoader());
                interfaceC83713oG = new C122145g6(arrayList2);
            }
        } else {
            Parcelable readParcelable = parcel.readParcelable(ThreadIdParcelable.class.getClassLoader());
            if (readParcelable != null) {
                interfaceC83713oG = ((ThreadIdParcelable) readParcelable).A00;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return interfaceC83713oG;
    }
}
