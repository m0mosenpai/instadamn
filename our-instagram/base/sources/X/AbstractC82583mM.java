package X;

import com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ParcelableSignalData;

/* renamed from: X.3mM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC82583mM {
    public long A00() {
        return ((C82573mL) this).A09;
    }

    public String A02() {
        return ((C82573mL) this).A0C;
    }

    public String A03() {
        return ((C82573mL) this).A0D;
    }

    public abstract String A04();

    public ParcelableSignalData A01() {
        C82573mL c82573mL = (C82573mL) this;
        String str = c82573mL.A0E;
        EnumC64262vl enumC64262vl = c82573mL.A0B;
        String str2 = c82573mL.A0G;
        String str3 = c82573mL.A0F;
        Long valueOf = Long.valueOf(c82573mL.A0A);
        Long valueOf2 = Long.valueOf(c82573mL.A09);
        Float valueOf3 = Float.valueOf(c82573mL.A00);
        String str4 = c82573mL.A0C;
        String str5 = c82573mL.A0D;
        return new ParcelableSignalData(enumC64262vl, null, null, valueOf3, Integer.valueOf(c82573mL.A06), Integer.valueOf(c82573mL.A03), Integer.valueOf(c82573mL.A04), Integer.valueOf(c82573mL.A02), Integer.valueOf(c82573mL.A08), Integer.valueOf(c82573mL.A01), Integer.valueOf(c82573mL.A07), Integer.valueOf(c82573mL.A05), null, valueOf, valueOf2, null, null, null, null, str, str2, str3, str4, str5, null, null, null, null, null, null, c82573mL.A0H, null, null, null, null, null, null, null);
    }
}
