package X;

import android.opengl.Matrix;
import android.util.Pair;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.basic.NativeConfigFactory;
import com.facebook.onecamera.components.mediagraph.iglu.nativegraph.IgluFilterNativeGraph;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.9eD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214139eD extends AbstractC201618vq implements InterfaceC179577y7, InterfaceC201628vr {
    public String A00;
    public boolean A01;
    public boolean A02;
    public InterfaceC179187xU A03;
    public final InterfaceC198588q7 A04;
    public final IgluFilterNativeGraph A05;
    public final HashMap A06;
    public final float[] A07;
    public final C198688qJ A08;
    public final C198548q3 A09;

    @Override // X.C81A
    public final void Dr7(C179877yd c179877yd) {
        this.A02 = false;
        C198548q3 c198548q3 = this.A09;
        IgluConfigHolder createIgAssetConfig = NativeConfigFactory.createIgAssetConfig(c198548q3.A00, c198548q3.A01);
        C14360o3.A07(createIgAssetConfig);
        this.A05.attach(createIgAssetConfig);
        InterfaceC198588q7 interfaceC198588q7 = this.A04;
        if (interfaceC198588q7 != null) {
            interfaceC198588q7.attach(createIgAssetConfig);
        }
        createIgAssetConfig.release();
        this.A01 = true;
    }

    @Override // X.C81A
    public final void DrA() {
        synchronized (this) {
            if (!this.A02) {
                this.A02 = true;
                this.A01 = false;
                Iterator A0k = AbstractC167007dF.A0k(this.A06);
                while (A0k.hasNext()) {
                    FilterManagerImpl filterManagerImpl = (FilterManagerImpl) ((Pair) A0k.next()).first;
                    if (filterManagerImpl != null) {
                        filterManagerImpl.release();
                    }
                }
                InterfaceC198588q7 interfaceC198588q7 = this.A04;
                if (interfaceC198588q7 != null) {
                    interfaceC198588q7.detach();
                }
                this.A05.detach();
            }
        }
    }

    @Override // X.C81A
    public final void EPl(X9R x9r) {
    }

    @Override // X.InterfaceC201628vr
    public final void ESB(Integer num) {
    }

    @Override // X.C81A
    @Deprecated
    public final boolean Ejv() {
        return false;
    }

    @Override // X.C81A
    public final boolean isEnabled() {
        return true;
    }

    public final void A00(InterfaceC199548s4 interfaceC199548s4, String str) {
        Object filterManagerImpl;
        HashMap hashMap = this.A06;
        Pair pair = (Pair) hashMap.get(str);
        if (pair != null) {
            filterManagerImpl = pair.first;
        } else {
            filterManagerImpl = new FilterManagerImpl(this.A04, null);
        }
        hashMap.put(str, new Pair(filterManagerImpl, interfaceC199548s4));
    }

    @Override // X.C81A
    public final Integer BIA() {
        return C05F.A00;
    }

    @Override // X.C81A
    public final boolean DCH(C201278vB c201278vB, long j) {
        Pair pair;
        if (!this.A01 || (pair = (Pair) this.A06.get(this.A00)) == null) {
            return false;
        }
        InterfaceC199548s4 interfaceC199548s4 = (InterfaceC199548s4) pair.second;
        FilterManagerImpl filterManagerImpl = (FilterManagerImpl) pair.first;
        if (interfaceC199548s4 == null || filterManagerImpl == null) {
            return false;
        }
        this.A08.FAd(Long.valueOf(j * 1000));
        float[] fArr = this.A07;
        Matrix.multiplyMM(fArr, 0, c201278vB.A04, 0, c201278vB.A05, 0);
        Matrix.multiplyMM(fArr, 0, fArr, 0, c201278vB.A03, 0);
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        AnonymousClass810 A00 = c201278vB.A00();
        interfaceC199548s4.AC6(filterManagerImpl);
        interfaceC199548s4.ACJ(filterManagerImpl);
        interfaceC199548s4.ACI(filterManagerImpl, fArr, c201278vB.A02);
        IgluFilterNativeGraph igluFilterNativeGraph = this.A05;
        igluFilterNativeGraph.updateFilter(filterManagerImpl.getFilterWeakPtr());
        int i = A00.A00;
        int i2 = A00.A01;
        AnonymousClass812 anonymousClass812 = A00.A02;
        igluFilterNativeGraph.setInputTexture(i, i2, anonymousClass812.A01, anonymousClass812.A00);
        igluFilterNativeGraph.useCurrentOutputFramebuffer(14);
        igluFilterNativeGraph.render("IgluFilterRenderer");
        return true;
    }

    @Override // X.InterfaceC179577y7
    public final void Ecb(InterfaceC179187xU interfaceC179187xU) {
        InterfaceC179187xU interfaceC179187xU2 = this.A03;
        if (interfaceC179187xU != interfaceC179187xU2) {
            if (interfaceC179187xU2 != null) {
                interfaceC179187xU2.F9Y(this, EnumC179217xX.A0I);
            }
            if (interfaceC179187xU != null) {
                interfaceC179187xU.EDH(this, EnumC179217xX.A0I);
            }
            this.A03 = interfaceC179187xU;
        }
    }

    public C214139eD(InterfaceC198588q7 interfaceC198588q7, C198548q3 c198548q3) {
        HashMap A1G = AbstractC166987dD.A1G();
        this.A06 = A1G;
        this.A07 = new float[16];
        this.A02 = false;
        this.A00 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        this.A09 = c198548q3;
        this.A04 = interfaceC198588q7;
        this.A05 = new IgluFilterNativeGraph();
        A1G.put(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, new Pair(new FilterManagerImpl(interfaceC198588q7, null), null));
        this.A08 = new C198688qJ();
    }

    @Override // X.InterfaceC179577y7
    public final void DfO(InterfaceC179247xa interfaceC179247xa) {
        if (interfaceC179247xa.CBM() == EnumC179217xX.A0I) {
            throw AbstractC166987dD.A15("getUpdater");
        }
    }
}
