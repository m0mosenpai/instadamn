package X;

import android.graphics.Typeface;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.leadgen.core.model.LeadGenTrustSignal;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.MUt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50583MUt implements Comparator {
    public final int A00;

    public C50583MUt(int i) {
        this.A00 = i;
    }

    public static List A00(Iterable iterable, int i) {
        return AbstractC001800i.A0g(iterable, new C50583MUt(i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num;
        Comparable valueOf;
        Integer num2;
        Comparable valueOf2;
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                valueOf = Long.valueOf(((C51574MqS) obj).A00);
                valueOf2 = Long.valueOf(((C51574MqS) obj2).A00);
                return C2BS.A00(valueOf, valueOf2);
            case 1:
                long j = ((C1125956n) obj).A00;
                long j2 = ((C1125956n) obj2).A00;
                if (j < j2) {
                    return -1;
                }
                return AbstractC167007dF.A1O((j > j2 ? 1 : (j == j2 ? 0 : -1))) ? 1 : 0;
            case 2:
                Typeface typeface = C52375NFr.A0D;
                return ((C54589O9q) obj).A02.compareTo(((C54589O9q) obj2).A02);
            case 3:
                valueOf = Long.valueOf(((C51665Mrw) obj).A01);
                valueOf2 = Long.valueOf(((C51665Mrw) obj2).A01);
                return C2BS.A00(valueOf, valueOf2);
            case 4:
                valueOf = Long.valueOf(((C51665Mrw) obj2).A01);
                valueOf2 = Long.valueOf(((C51665Mrw) obj).A01);
                return C2BS.A00(valueOf, valueOf2);
            case 5:
                return C2BS.A00((Comparable) ((C09530e4) obj).A00, (Comparable) ((C09530e4) obj2).A00);
            case 6:
            case 7:
                valueOf = Integer.valueOf(((US9) obj).A00());
                valueOf2 = Integer.valueOf(((US9) obj2).A00());
                return C2BS.A00(valueOf, valueOf2);
            case 8:
                valueOf = Integer.valueOf(((C51631MrO) obj).A03.A00);
                valueOf2 = Integer.valueOf(((C51631MrO) obj2).A03.A00);
                return C2BS.A00(valueOf, valueOf2);
            case 9:
                valueOf = Integer.valueOf(((OU5) obj).A01);
                valueOf2 = Integer.valueOf(((OU5) obj2).A01);
                return C2BS.A00(valueOf, valueOf2);
            case 10:
                valueOf = ((User) obj).getUsername();
                valueOf2 = ((User) obj2).getUsername();
                return C2BS.A00(valueOf, valueOf2);
            case 11:
                valueOf = Double.valueOf(((C2JS) obj2).getCoercedDoubleField(2, "rank"));
                valueOf2 = Double.valueOf(((C2JS) obj).getCoercedDoubleField(2, "rank"));
                return C2BS.A00(valueOf, valueOf2);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                valueOf = Double.valueOf(((C51632MrP) obj2).A00);
                valueOf2 = Double.valueOf(((C51632MrP) obj).A00);
                return C2BS.A00(valueOf, valueOf2);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                valueOf = Integer.valueOf(((LeadGenTrustSignal) obj).A00);
                valueOf2 = Integer.valueOf(((LeadGenTrustSignal) obj2).A00);
                return C2BS.A00(valueOf, valueOf2);
            case 14:
                valueOf = ((C51761Mtk) obj).A04();
                valueOf2 = ((C51761Mtk) obj2).A04();
                return C2BS.A00(valueOf, valueOf2);
            case Process.SIGTERM /* 15 */:
                return ((PendingRecipient) obj).getId().compareTo(((PendingRecipient) obj2).getId());
            case 16:
                return C2BS.A00((String) obj, (String) obj2);
            case 17:
                switch (((ODx) obj).A03.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    default:
                        i = 0;
                        break;
                }
                valueOf = Integer.valueOf(i);
                switch (((ODx) obj2).A03.intValue()) {
                    case 1:
                        i2 = 1;
                        break;
                    case 2:
                        i2 = 2;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                valueOf2 = Integer.valueOf(i2);
                return C2BS.A00(valueOf, valueOf2);
            case 18:
                C51874MwI c51874MwI = (C51874MwI) obj2;
                if (c51874MwI == null || (num = c51874MwI.A02) == null) {
                    num = C05F.A00;
                }
                valueOf = Integer.valueOf(AbstractC54170Nx6.A00(num));
                C51874MwI c51874MwI2 = (C51874MwI) obj;
                if (c51874MwI2 == null || (num2 = c51874MwI2.A02) == null) {
                    num2 = C05F.A00;
                }
                valueOf2 = Integer.valueOf(AbstractC54170Nx6.A00(num2));
                return C2BS.A00(valueOf, valueOf2);
            default:
                valueOf = Long.valueOf(AbstractC41774Ieq.A02((UpcomingEvent) obj));
                valueOf2 = Long.valueOf(AbstractC41774Ieq.A02((UpcomingEvent) obj2));
                return C2BS.A00(valueOf, valueOf2);
        }
    }
}
