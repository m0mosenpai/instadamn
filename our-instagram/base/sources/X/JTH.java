package X;

import android.app.Activity;
import android.content.Intent;
import androidx.paging.PageFetcherSnapshot;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class JTH extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public static Object A01(C1Dk c1Dk, C27271C1v c27271C1v, Object obj, JTH jth) {
        C27271C1v.A00(c27271C1v).A09("complete_ai_create_request_sent");
        C40701ud c40701ud = c27271C1v.A04;
        C14360o3.A0A(c1Dk);
        jth.A03 = c27271C1v;
        jth.A04 = obj;
        jth.A00 = 1;
        return c40701ud.A04(c1Dk, jth);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        JTH jth;
        Object obj6;
        Object obj7;
        int i2;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        int i3;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        int i4;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        int i5;
        JTH jth2;
        Object obj20;
        Object obj21;
        Object obj22;
        int i6;
        Object obj23;
        Object obj24;
        Object obj25;
        Object obj26;
        Object obj27;
        int i7;
        switch (this.A06) {
            case 0:
                Object obj28 = this.A02;
                jth2 = new JTH(interfaceC23621Ds, this.A05, this.A01, this.A03, obj28, 0);
                jth2.A04 = obj;
                return jth2;
            case 1:
                obj4 = this.A04;
                obj2 = this.A01;
                obj3 = this.A02;
                obj5 = this.A03;
                i = 1;
                JTH jth3 = new JTH(obj2, obj5, obj3, obj4, interfaceC23621Ds, i);
                jth3.A05 = obj;
                return jth3;
            case 2:
                obj26 = this.A03;
                obj25 = this.A05;
                obj23 = this.A04;
                obj27 = this.A02;
                obj24 = this.A01;
                i7 = 2;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case 3:
                obj24 = this.A01;
                obj25 = this.A05;
                obj23 = this.A04;
                obj27 = this.A02;
                obj26 = this.A03;
                i7 = 3;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case 4:
                obj4 = this.A04;
                obj5 = this.A03;
                obj2 = this.A01;
                obj3 = this.A02;
                i = 4;
                JTH jth32 = new JTH(obj2, obj5, obj3, obj4, interfaceC23621Ds, i);
                jth32.A05 = obj;
                return jth32;
            case 5:
                obj8 = this.A01;
                obj9 = this.A02;
                obj10 = this.A05;
                obj11 = this.A03;
                i3 = 5;
                jth2 = new JTH(interfaceC23621Ds, obj10, obj8, obj11, obj9, i3);
                jth2.A04 = obj;
                return jth2;
            case 6:
                jth2 = new JTH(this.A01, interfaceC23621Ds, (InterfaceC16610sE) this.A02, (InterfaceC19390xP) this.A03);
                jth2.A04 = obj;
                return jth2;
            case 7:
                JTH jth4 = new JTH((PageFetcherSnapshot) this.A05, interfaceC23621Ds);
                jth4.A01 = obj;
                return jth4;
            case 8:
                obj25 = this.A05;
                obj24 = this.A01;
                obj27 = this.A02;
                obj23 = this.A04;
                obj26 = this.A03;
                i7 = 8;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case 9:
                Object obj29 = this.A03;
                Object obj30 = this.A04;
                return new JTH(this.A01, obj29, this.A02, obj30, interfaceC23621Ds, 9);
            case 10:
                obj20 = this.A01;
                obj21 = this.A05;
                obj22 = this.A02;
                i6 = 10;
                return new JTH(obj20, obj21, obj22, interfaceC23621Ds, i6);
            case 11:
                obj20 = this.A01;
                obj21 = this.A05;
                obj22 = this.A02;
                i6 = 11;
                return new JTH(obj20, obj21, obj22, interfaceC23621Ds, i6);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj20 = this.A01;
                obj21 = this.A05;
                obj22 = this.A02;
                i6 = 12;
                return new JTH(obj20, obj21, obj22, interfaceC23621Ds, i6);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj20 = this.A01;
                obj21 = this.A05;
                obj22 = this.A02;
                i6 = 13;
                return new JTH(obj20, obj21, obj22, interfaceC23621Ds, i6);
            case 14:
                obj23 = this.A04;
                obj26 = this.A03;
                obj25 = this.A05;
                obj27 = this.A02;
                obj24 = this.A01;
                i7 = 14;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case Process.SIGTERM /* 15 */:
                obj25 = this.A05;
                obj27 = this.A02;
                obj26 = this.A03;
                obj24 = this.A01;
                obj23 = this.A04;
                i7 = 15;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case 16:
                obj2 = this.A01;
                obj3 = this.A02;
                obj5 = this.A03;
                obj4 = this.A04;
                i = 16;
                JTH jth322 = new JTH(obj2, obj5, obj3, obj4, interfaceC23621Ds, i);
                jth322.A05 = obj;
                return jth322;
            case 17:
                jth = new JTH((L4Q) this.A02, interfaceC23621Ds, (InterfaceC24731Iq) this.A01);
                jth.A03 = obj;
                return jth;
            case 18:
                obj2 = this.A01;
                obj5 = this.A03;
                obj3 = this.A02;
                obj4 = this.A04;
                i = 18;
                JTH jth3222 = new JTH(obj2, obj5, obj3, obj4, interfaceC23621Ds, i);
                jth3222.A05 = obj;
                return jth3222;
            case Process.SIGSTOP /* 19 */:
                jth2 = new JTH(interfaceC23621Ds, this.A05, this.A01, this.A03, this.A02, 19);
                jth2.A04 = obj;
                return jth2;
            case 20:
                obj16 = this.A05;
                obj17 = this.A01;
                obj18 = this.A03;
                obj19 = this.A02;
                i5 = 20;
                jth2 = new JTH(interfaceC23621Ds, obj16, obj17, obj18, obj19, i5);
                jth2.A04 = obj;
                return jth2;
            case 21:
                obj16 = this.A05;
                obj17 = this.A01;
                obj18 = this.A03;
                obj19 = this.A02;
                i5 = 21;
                jth2 = new JTH(interfaceC23621Ds, obj16, obj17, obj18, obj19, i5);
                jth2.A04 = obj;
                return jth2;
            case 22:
                obj23 = this.A04;
                obj26 = this.A03;
                obj25 = this.A05;
                obj27 = this.A02;
                obj24 = this.A01;
                i7 = 22;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case 23:
                KZ8 kz8 = (KZ8) this.A05;
                return new JTH((Activity) this.A02, (Intent) this.A03, kz8, (InterfaceC58027PoD) this.A01, (UserSession) this.A04, interfaceC23621Ds, this.A00);
            case 24:
                obj2 = this.A01;
                obj3 = this.A02;
                obj4 = this.A04;
                obj5 = this.A03;
                i = 24;
                JTH jth32222 = new JTH(obj2, obj5, obj3, obj4, interfaceC23621Ds, i);
                jth32222.A05 = obj;
                return jth32222;
            case 25:
                obj26 = this.A03;
                obj27 = this.A02;
                obj25 = this.A05;
                obj23 = this.A04;
                obj24 = this.A01;
                i7 = 25;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case 26:
                obj26 = this.A03;
                obj27 = this.A02;
                obj25 = this.A05;
                obj23 = this.A04;
                obj24 = this.A01;
                i7 = 26;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case 27:
                obj26 = this.A03;
                obj27 = this.A02;
                obj25 = this.A05;
                obj24 = this.A01;
                obj23 = this.A04;
                i7 = 27;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case 28:
                obj23 = this.A04;
                obj26 = this.A03;
                obj27 = this.A02;
                obj25 = this.A05;
                obj24 = this.A01;
                i7 = 28;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                obj24 = this.A01;
                obj27 = this.A02;
                obj26 = this.A03;
                obj25 = this.A05;
                obj23 = this.A04;
                i7 = 29;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case 30:
                obj25 = this.A05;
                obj26 = this.A03;
                obj27 = this.A02;
                obj24 = this.A01;
                obj23 = this.A04;
                i7 = 30;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case 31:
                obj26 = this.A03;
                obj27 = this.A02;
                obj23 = this.A04;
                obj24 = this.A01;
                obj25 = this.A05;
                i7 = 31;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case 32:
                obj23 = this.A04;
                obj27 = this.A02;
                obj24 = this.A01;
                obj25 = this.A05;
                obj26 = this.A03;
                i7 = 32;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case 33:
                obj23 = this.A04;
                obj27 = this.A02;
                obj24 = this.A01;
                obj25 = this.A05;
                obj26 = this.A03;
                i7 = 33;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case 34:
                obj27 = this.A02;
                obj24 = this.A01;
                obj23 = this.A04;
                obj25 = this.A05;
                obj26 = this.A03;
                i7 = 34;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case 35:
                obj25 = this.A05;
                obj23 = this.A04;
                obj26 = this.A03;
                obj27 = this.A02;
                obj24 = this.A01;
                i7 = 35;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case 36:
                obj23 = this.A04;
                obj26 = this.A03;
                obj25 = this.A05;
                obj24 = this.A01;
                obj27 = this.A02;
                i7 = 36;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case 37:
                obj12 = this.A05;
                obj13 = this.A03;
                obj14 = this.A02;
                obj15 = this.A01;
                i4 = 37;
                return new JTH(interfaceC23621Ds, obj12, obj15, obj13, obj14, i4);
            case 38:
                obj12 = this.A05;
                obj13 = this.A03;
                obj14 = this.A02;
                obj15 = this.A01;
                i4 = 38;
                return new JTH(interfaceC23621Ds, obj12, obj15, obj13, obj14, i4);
            case 39:
                obj8 = this.A01;
                obj9 = this.A02;
                obj10 = this.A05;
                obj11 = this.A03;
                i3 = 39;
                jth2 = new JTH(interfaceC23621Ds, obj10, obj8, obj11, obj9, i3);
                jth2.A04 = obj;
                return jth2;
            case 40:
                obj6 = this.A05;
                obj7 = this.A01;
                i2 = 40;
                return new JTH(obj6, obj7, interfaceC23621Ds, i2);
            case Seq.NULL_REFNUM /* 41 */:
                obj6 = this.A05;
                obj7 = this.A01;
                i2 = 41;
                return new JTH(obj6, obj7, interfaceC23621Ds, i2);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                obj6 = this.A05;
                obj7 = this.A01;
                i2 = 42;
                return new JTH(obj6, obj7, interfaceC23621Ds, i2);
            case 43:
                obj6 = this.A05;
                obj7 = this.A01;
                i2 = 43;
                return new JTH(obj6, obj7, interfaceC23621Ds, i2);
            case 44:
                jth = new JTH(this.A01, this.A05, this.A02, interfaceC23621Ds, 44);
                jth.A03 = obj;
                return jth;
            case 45:
                obj25 = this.A05;
                obj23 = this.A04;
                obj24 = this.A01;
                obj26 = this.A03;
                obj27 = this.A02;
                i7 = 45;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                obj23 = this.A04;
                obj26 = this.A03;
                obj25 = this.A05;
                obj27 = this.A02;
                obj24 = this.A01;
                i7 = 46;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case 47:
                obj23 = this.A04;
                obj24 = this.A01;
                obj25 = this.A05;
                obj26 = this.A03;
                obj27 = this.A02;
                i7 = 47;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
            case 48:
                obj2 = this.A01;
                obj3 = this.A02;
                obj4 = this.A04;
                obj5 = this.A03;
                i = 48;
                JTH jth322222 = new JTH(obj2, obj5, obj3, obj4, interfaceC23621Ds, i);
                jth322222.A05 = obj;
                return jth322222;
            default:
                obj23 = this.A04;
                obj26 = this.A03;
                obj25 = this.A05;
                obj27 = this.A02;
                obj24 = this.A01;
                i7 = 49;
                return new JTH(obj24, obj25, obj23, obj27, obj26, interfaceC23621Ds, i7);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:533:0x0bef
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x1090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0d04 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x052e A[Catch: all -> 0x0539, TryCatch #7 {all -> 0x0539, blocks: (B:191:0x0525, B:192:0x0528, B:194:0x052e, B:195:0x0533), top: B:190:0x0525 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0cd7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0bf5  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0c25 A[Catch: CancellationException -> 0x0bef, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0bef, blocks: (B:518:0x0bdf, B:526:0x0c25, B:528:0x0c48), top: B:517:0x0bdf }] */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0da6  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0d66 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0e5b  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0e1b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0f1c  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x0edc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:681:0x0fd1  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x0f91 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:713:0x100d  */
    /* JADX WARN: Removed duplicated region for block: B:747:0x1151  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x13b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:828:0x12a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:494:0x0c23 -> B:488:0x0bef). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 5158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JTH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static C07T A00(Object obj, JTH jth) {
        AbstractC09560e7.A00(obj);
        return ((C07X) jth.A04).getLifecycle();
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((JTH) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JTH(InterfaceC23621Ds interfaceC23621Ds, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = i;
        this.A05 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JTH(L4Q l4q, InterfaceC23621Ds interfaceC23621Ds, InterfaceC24731Iq interfaceC24731Iq) {
        super(2, interfaceC23621Ds);
        this.A06 = 17;
        this.A01 = interfaceC24731Iq;
        this.A02 = l4q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JTH(Activity activity, Intent intent, KZ8 kz8, InterfaceC58027PoD interfaceC58027PoD, UserSession userSession, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = 23;
        this.A05 = kz8;
        this.A02 = activity;
        this.A04 = userSession;
        this.A00 = i;
        this.A03 = intent;
        this.A01 = interfaceC58027PoD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JTH(PageFetcherSnapshot pageFetcherSnapshot, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A06 = 7;
        this.A05 = pageFetcherSnapshot;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JTH(Object obj, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16610sE interfaceC16610sE, InterfaceC19390xP interfaceC19390xP) {
        super(2, interfaceC23621Ds);
        this.A06 = 6;
        this.A01 = obj;
        this.A03 = interfaceC19390xP;
        this.A02 = interfaceC16610sE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JTH(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = i;
        this.A05 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JTH(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = i;
        this.A01 = obj;
        this.A05 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JTH(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JTH(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = i;
        this.A01 = obj;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A02 = obj4;
        this.A03 = obj5;
    }
}
