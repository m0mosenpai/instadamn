package X;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequest;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem;
import libraries.access.src.main.base.common.FXDeviceItem;

/* loaded from: classes4.dex */
public abstract class A1F {
    public static ArrayList A00(AbstractC12990ll abstractC12990ll, String str, String str2, FXAccessLibraryDeviceRequest fXAccessLibraryDeviceRequest) {
        ArrayList<AbstractC200848uR> A1E;
        ArrayList arrayList;
        AbstractC167017dG.A1O(abstractC12990ll, str);
        if (AbstractC86593tX.A0r(new C105914q2(abstractC12990ll), C05F.A0Y, str, str2)) {
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator it = AbstractC166987dD.A1F(fXAccessLibraryDeviceRequest.A00).iterator();
            loop0: while (it.hasNext()) {
                FXAccessLibraryDeviceRequestItem fXAccessLibraryDeviceRequestItem = (FXAccessLibraryDeviceRequestItem) AbstractC166997dE.A0l(it);
                EnumC200808uN enumC200808uN = fXAccessLibraryDeviceRequestItem.A00;
                EnumC200808uN enumC200808uN2 = EnumC200808uN.A06;
                if (enumC200808uN == enumC200808uN2) {
                    EnumC46133KbX enumC46133KbX = fXAccessLibraryDeviceRequestItem.A01;
                    C14360o3.A07(enumC46133KbX);
                    EnumC46133KbX enumC46133KbX2 = EnumC46133KbX.MACHINE_ID;
                    FXDeviceItem fXDeviceItem = null;
                    if (enumC46133KbX == enumC46133KbX2) {
                        String str3 = C1F8.A00(abstractC12990ll).A01.A00;
                        if (str3 != null) {
                            fXDeviceItem = new FXDeviceItem(null, str3, enumC200808uN2, enumC46133KbX2);
                        }
                    } else {
                        fXDeviceItem = new FXDeviceItem(null, C16030qx.A00(abstractC12990ll.getDeviceSession().A06()), enumC200808uN2, EnumC46133KbX.DEVICE_ID);
                    }
                    if (fXDeviceItem != null) {
                        A1E2.add(fXDeviceItem);
                    }
                } else {
                    Context A06 = abstractC12990ll.getDeviceSession().A06();
                    C200918uY c200918uY = new C200918uY(new C200758uI());
                    ArrayList A1E3 = AbstractC166987dD.A1E();
                    EnumC200798uM A01 = AbstractC200928uZ.A01(enumC200808uN);
                    if (A01 != null) {
                        EnumC46133KbX enumC46133KbX3 = fXAccessLibraryDeviceRequestItem.A01;
                        ArrayList A1E4 = AbstractC166987dD.A1E();
                        C14360o3.A0B(enumC46133KbX3, 1);
                        if (enumC46133KbX3 == EnumC46133KbX.MACHINE_ID) {
                            List list = AbstractC200818uO.A02;
                            A1E = AbstractC166987dD.A1E();
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                AbstractC200848uR.A00(A01, A1E, it2);
                            }
                        } else {
                            List list2 = AbstractC200818uO.A01;
                            A1E = AbstractC166987dD.A1E();
                            Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                AbstractC200848uR.A00(A01, A1E, it3);
                            }
                        }
                        for (AbstractC200848uR abstractC200848uR : A1E) {
                            String num = Integer.toString(c200918uY.A02.incrementAndGet());
                            Integer num2 = C05F.A00;
                            ContentProviderClient A00 = C200918uY.A00(A06, enumC46133KbX3, num2, num, abstractC200848uR, c200918uY);
                            if (A00 != null) {
                                try {
                                    AbstractC200888uV abstractC200888uV = c200918uY.A05;
                                    AbstractC167007dF.A1F(abstractC200848uR, 1, num);
                                    Cursor A002 = C200778uK.A00(A00, enumC46133KbX3, num2, null, num, abstractC200848uR, abstractC200888uV);
                                    if (A002 != null) {
                                        arrayList = AbstractC166987dD.A1E();
                                        EnumC200798uM enumC200798uM = abstractC200848uR.A04;
                                        InterfaceC203078yP interfaceC203078yP = (InterfaceC203078yP) AbstractC203048yM.A00.get(enumC200798uM);
                                        if (interfaceC203078yP == null) {
                                            throw new RuntimeException(AbstractC167017dG.A0n(enumC200798uM, "Can't find corresponding transformer for SsoSource =", AbstractC166987dD.A1C()));
                                            break loop0;
                                        }
                                        while (A002.moveToNext()) {
                                            try {
                                                FXDeviceItem F8O = interfaceC203078yP.F8O(A002, enumC46133KbX3, enumC200798uM);
                                                if (F8O != null) {
                                                    arrayList.add(F8O);
                                                }
                                            } catch (C200998ug unused) {
                                                A002.close();
                                            } catch (Throwable th) {
                                                A002.close();
                                                throw th;
                                            }
                                        }
                                        A002.close();
                                        A1E4 = arrayList;
                                        A00.close();
                                    }
                                    arrayList = AbstractC166987dD.A1E();
                                    A1E4 = arrayList;
                                    A00.close();
                                } catch (RemoteException unused2) {
                                    continue;
                                }
                            }
                        }
                        A1E3.addAll(Collections.unmodifiableList(A1E4));
                    }
                    A1E2.addAll(A1E3);
                }
            }
            if (!A1E2.isEmpty()) {
                return A1E2;
            }
        }
        return null;
    }
}
