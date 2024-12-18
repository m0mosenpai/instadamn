package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.flexiblesampling.SamplingResult;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.OverlappingFileLockException;

/* renamed from: X.SvS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63894SvS implements InterfaceC37451oi {
    public final C62602SIg A00;

    @Override // X.InterfaceC37451oi
    public final void onEventsWritten(int i) {
    }

    @Override // X.InterfaceC37451oi
    public final void onEventReceived() {
        int i;
        long nextInt;
        DataInputStream dataInputStream;
        int readInt;
        long j;
        long j2;
        long j3;
        DataOutputStream dataOutputStream;
        C62602SIg c62602SIg = this.A00;
        int i2 = c62602SIg.A02;
        if (i2 > 0) {
            int i3 = c62602SIg.A00;
            if (i3 == Integer.MAX_VALUE) {
                i = (Integer.MAX_VALUE % i2) + 1;
            } else {
                i = i3 + 1;
            }
            c62602SIg.A00 = i;
            if (i % i2 == 0) {
                C39091ri c39091ri = c62602SIg.A04;
                Integer num = C05F.A00;
                SamplingResult samplingResult = SamplingResult.A05;
                if (samplingResult == null) {
                    samplingResult = new SamplingResult(0L, 1, true, false, false);
                    SamplingResult.A05 = samplingResult;
                }
                C39141rn A00 = c39091ri.A00(samplingResult, num, "pigeon_beacon", false);
                A00.A03 = OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED | A00.A03;
                A00.A06(AbstractC111324zv.A00(495), "marauder");
                SHG shg = c62602SIg.A01;
                if (shg == null) {
                    File A002 = C0eS.A00(c62602SIg.A03, 1262619000);
                    A002.mkdirs();
                    shg = new SHG(MSW.A0w(A002, "micro_batch"));
                    c62602SIg.A01 = shg;
                }
                try {
                    synchronized (shg) {
                        File file = shg.A02;
                        if (!file.exists() && !shg.A01.exists()) {
                            File file2 = shg.A00;
                            if (!file2.exists() && !file2.mkdirs()) {
                                throw MSW.A0y(AbstractC167017dG.A0n(file2, "Cannot create ", AbstractC166987dD.A1C()));
                            }
                        }
                        C0Hh c0Hh = new C0Hh(file);
                        try {
                            File file3 = shg.A01;
                            try {
                                if (file3.exists()) {
                                    try {
                                        dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file3), 16));
                                        try {
                                            readInt = dataInputStream.readInt();
                                        } catch (Throwable th) {
                                            dataInputStream.close();
                                            throw th;
                                        }
                                    } catch (IOException e) {
                                        C0K8.A0M("BeaconIdGenerator", "Failure reading beacon id file %s", e, file3);
                                    }
                                    if (readInt == 1) {
                                        long readLong = dataInputStream.readLong();
                                        dataInputStream.close();
                                        if (readLong != 0) {
                                            int i4 = (int) (readLong & 4294967295L);
                                            if (((int) (readLong >> 32)) == Integer.MAX_VALUE) {
                                                j = 0 << 32;
                                                j2 = shg.A03.nextInt();
                                            } else {
                                                j = (r14 + 1) << 32;
                                                j2 = i4;
                                            }
                                            j3 = j2 & 4294967295L;
                                            nextInt = j3 | j;
                                            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file3), 16));
                                            dataOutputStream.writeInt(1);
                                            dataOutputStream.writeLong(nextInt);
                                            dataOutputStream.close();
                                            c0Hh.close();
                                        }
                                    } else {
                                        throw AbstractC58320PtC.A0i("expected 1; got ", readInt);
                                    }
                                }
                                dataOutputStream.writeInt(1);
                                dataOutputStream.writeLong(nextInt);
                                dataOutputStream.close();
                                c0Hh.close();
                            } catch (Throwable th2) {
                                dataOutputStream.close();
                                throw th2;
                            }
                            j = 0 << 32;
                            j3 = shg.A03.nextInt() & 4294967295L;
                            nextInt = j3 | j;
                            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file3), 16));
                        } catch (Throwable th3) {
                            c0Hh.close();
                            throw th3;
                        }
                    }
                } catch (Exception e2) {
                    C0K8.A0I("BeaconIdGenerator", "Failed to increment beacon id", e2);
                    if (!(e2 instanceof IOException) && !(e2 instanceof OverlappingFileLockException)) {
                        throw e2;
                    }
                    nextInt = (shg.A03.nextInt() & 4294967295L) | (0 << 32);
                }
                A00.A06("tier", "micro_batch");
                A00.A05(Integer.valueOf((int) (nextInt >> 32)), "beacon_id");
                A00.A05(Integer.valueOf((int) (nextInt & 4294967295L)), "beacon_session_id");
                A00.A02();
                A00.A09();
                if (c62602SIg.A05) {
                    InterfaceC39211ry interfaceC39211ry = c39091ri.A03;
                    C39141rn A003 = c39091ri.A00(interfaceC39211ry.Eiw("falco_data_quality_stream"), num, "falco_data_quality_stream", false);
                    C39141rn.A00(A003);
                    A003.A0C = "falco_data_quality_stream_module";
                    A003.A07(true);
                    A003.A05(18014398510716552L, "test_int");
                    Double valueOf = Double.valueOf(1.725863284873E9d);
                    A003.A05(valueOf, "test_float");
                    A003.A06("test_string", "Test String to test extra data encoding during transport");
                    A003.A04(true, "test_bool");
                    A003.A09();
                    C39141rn A004 = c39091ri.A00(interfaceC39211ry.Eiw("falco_data_quality_batch"), num, "falco_data_quality_batch", false);
                    C39141rn.A00(A004);
                    A004.A0C = "falco_data_quality_batch_module";
                    A004.A07(true);
                    A004.A05(18014398510716552L, "test_int");
                    A004.A05(valueOf, "test_float");
                    A004.A06("test_string", "Test String to test extra data encoding during transport");
                    A004.A04(true, "test_bool");
                    A004.A09();
                }
            }
        }
    }

    public C63894SvS(C62602SIg c62602SIg) {
        this.A00 = c62602SIg;
    }
}
