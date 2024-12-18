package com.instagram.direct.magicmediaremix.viewmodel;

import X.A0Y;
import X.AbstractC001800i;
import X.AbstractC09560e7;
import X.AbstractC13530mf;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC188868Yc;
import X.AbstractC209669Pc;
import X.AbstractC23611Dp;
import X.AbstractC50673MYr;
import X.AbstractC917048o;
import X.AwS;
import X.C0eB;
import X.C11T;
import X.C14360o3;
import X.C148286ly;
import X.C183978Ee;
import X.C196948nP;
import X.C199008r1;
import X.C1NC;
import X.C203248yh;
import X.C203278yk;
import X.C203298ym;
import X.C203318yo;
import X.C20I;
import X.C217849kH;
import X.C45113Jxi;
import X.C47365KwG;
import X.C48515LdD;
import X.C50472Tr;
import X.C5NL;
import X.C5NM;
import X.C8FC;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.KZD;
import X.M75;
import X.MHU;
import X.RunnableC24448AsT;
import android.content.Context;
import android.graphics.Bitmap;
import com.google.common.collect.ImmutableList;
import com.google.common.io.Files;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixRepository$persistMediaEdits$1", f = "MagicMediaRemixRepository.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class MagicMediaRemixRepository$persistMediaEdits$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Bitmap A02;
    public final /* synthetic */ TargetViewSizeProvider A03;
    public final /* synthetic */ CameraSpec A04;
    public final /* synthetic */ C199008r1 A05;
    public final /* synthetic */ A0Y A06;
    public final /* synthetic */ KZD A07;
    public final /* synthetic */ String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicMediaRemixRepository$persistMediaEdits$1(Context context, Bitmap bitmap, TargetViewSizeProvider targetViewSizeProvider, CameraSpec cameraSpec, C199008r1 c199008r1, A0Y a0y, KZD kzd, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A07 = kzd;
        this.A02 = bitmap;
        this.A05 = c199008r1;
        this.A01 = context;
        this.A03 = targetViewSizeProvider;
        this.A08 = str;
        this.A04 = cameraSpec;
        this.A06 = a0y;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        KZD kzd = this.A07;
        Bitmap bitmap = this.A02;
        C199008r1 c199008r1 = this.A05;
        return new MagicMediaRemixRepository$persistMediaEdits$1(this.A01, bitmap, this.A03, this.A04, c199008r1, this.A06, kzd, this.A08, interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Runnable awS;
        Object obj2;
        String str;
        List list;
        List list2;
        C148286ly c148286ly;
        ImmutableList A03;
        C203298ym c203298ym;
        C203298ym c203298ym2;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            KZD kzd = this.A07;
            UserSession userSession = kzd.A00;
            Bitmap bitmap = this.A02;
            C183978Ee A032 = AbstractC209669Pc.A03(bitmap, null, userSession, C50472Tr.A01(), AbstractC917048o.A04("direct_temp_photo", ".jpg"), 0, false);
            C48515LdD c48515LdD = kzd.A01;
            C199008r1 c199008r1 = this.A05;
            Context context = this.A01;
            String str2 = this.A08;
            A0Y a0y = this.A06;
            this.A00 = 1;
            try {
                C196948nP c196948nP = new C196948nP(A032);
                UserSession userSession2 = c48515LdD.A00;
                C14360o3.A0B(context, 0);
                C47365KwG c47365KwG = (C47365KwG) userSession2.A01(C47365KwG.class, new MHU(0, context, userSession2));
                Iterator it = c48515LdD.A02.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (C14360o3.A0K(((C45113Jxi) obj2).A04, str2)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                C45113Jxi c45113Jxi = (C45113Jxi) obj2;
                if (bitmap != null) {
                    C14360o3.A0B(str2, 0);
                    File file = new File(c47365KwG.A00, str2);
                    AbstractC13530mf.A08(file);
                    File file2 = new File(file, "cover.jpg");
                    Bitmap A0A = C1NC.A0A(bitmap, AbstractC188868Yc.A01(context), AbstractC188868Yc.A00(context), false);
                    C14360o3.A07(A0A);
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        AbstractC50673MYr.A00(Bitmap.CompressFormat.JPEG, A0A, fileOutputStream);
                        fileOutputStream.close();
                        str = file2.getPath();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            C20I.A00(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } else {
                    str = null;
                }
                C203248yh c203248yh = new C203248yh(c199008r1);
                C203278yk c203278yk = c203248yh.A02;
                if (c203278yk != null && (c203298ym2 = c203278yk.A04) != null) {
                    list = c203298ym2.A03;
                } else {
                    list = null;
                }
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C8FC c8fc = ((C203318yo) it2.next()).A01;
                        if (c8fc != null) {
                            c8fc.A0C = "MagicMediaTag";
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    C203278yk c203278yk2 = c203248yh.A02;
                    if (c203278yk2 != null && (c203298ym = c203278yk2.A04) != null) {
                        list2 = c203298ym.A03;
                    } else {
                        list2 = null;
                    }
                    if (list2 != null) {
                        ArrayList<C5NL> A0i = AbstractC167007dF.A0i(list2);
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            C5NM c5nm = ((C203318yo) it3.next()).A00;
                            if (c5nm != null) {
                                A0i.add(c5nm.A00());
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                        for (C5NL c5nl : A0i) {
                            if (c5nl instanceof C217849kH) {
                                Iterator it4 = ((C217849kH) c5nl).A00().A0O.iterator();
                                while (it4.hasNext() && (A03 = (c148286ly = (C148286ly) it4.next()).A03()) != null && !A03.isEmpty()) {
                                    ArrayList A0i2 = AbstractC167007dF.A0i(A03);
                                    Iterator<E> it5 = A03.iterator();
                                    while (it5.hasNext()) {
                                        File A11 = AbstractC166987dD.A11(AbstractC166987dD.A1B(it5));
                                        C14360o3.A0B(str2, 0);
                                        File A0M = AbstractC167027dH.A0M(c47365KwG.A00, A11, str2);
                                        Files.A01(A11, A0M);
                                        A0i2.add(A0M.getPath());
                                    }
                                    c148286ly.A05(AbstractC001800i.A0a(A0i2));
                                }
                            }
                        }
                        C11T.A02(new M75(c45113Jxi, c196948nP, c203248yh, a0y, c48515LdD, str, str2));
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } catch (Exception e) {
                if (!(e instanceof IOException) && !(e instanceof FileNotFoundException)) {
                    awS = new RunnableC24448AsT(e);
                } else {
                    awS = new AwS(a0y, e);
                }
                C11T.A02(awS);
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MagicMediaRemixRepository$persistMediaEdits$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
