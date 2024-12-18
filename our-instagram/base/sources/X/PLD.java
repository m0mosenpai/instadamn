package X;

import android.media.AudioAttributes;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesCompat;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class PLD implements Runnable {
    public final /* synthetic */ OLA A00;

    public PLD(OLA ola) {
        this.A00 = ola;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.9vC] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        EnumC53177NfZ enumC53177NfZ;
        OLA ola = this.A00;
        if (!ola.A01 && ola.A0C < 3) {
            SparseIntArray sparseIntArray = AudioAttributesCompat.A01;
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(3);
            builder.setContentType(2);
            builder.setUsage(1);
            AudioAttributesCompat A0M = AbstractC50522MSa.A0M(builder);
            int i = ola.A05.get();
            ?? obj = new Object();
            obj.A03 = AH6.A05;
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw AbstractC25230BEn.A0n("Illegal audio focus gain type ", i);
            }
            obj.A00 = i;
            obj.A01(ola.A03);
            obj.A03 = A0M;
            AH6 A00 = obj.A00();
            ola.A00 = A00;
            C4RG c4rg = ola.A02;
            C14360o3.A0A(A00);
            int A01 = c4rg.A01(A00);
            if (A01 != 1) {
                if (A01 == 2) {
                    str = "Delayed";
                } else {
                    str = "Failed";
                }
                AbstractC459729h.A01("AudioFocusManager", AnonymousClass001.A0R(str, " to acquire audio focus"), new Object[0]);
                ola.A04.DFr(A01);
                AtomicReference atomicReference = ola.A06;
                if (A01 == 2) {
                    enumC53177NfZ = EnumC53177NfZ.A03;
                } else {
                    enumC53177NfZ = EnumC53177NfZ.A04;
                }
                atomicReference.set(enumC53177NfZ);
                ola.A0C++;
                return;
            }
            ola.A01 = true;
            ola.A0C = 0;
            ola.A06.set(EnumC53177NfZ.A02);
        }
    }
}
