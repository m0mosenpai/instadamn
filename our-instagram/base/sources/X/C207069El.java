package X;

import android.view.View;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.pando.TreeJNI;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9El, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207069El extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207069El(Object obj, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        List list;
        switch (this.A00) {
            case 0:
                C20H c20h = ((C4P1) this.A02).A0C;
                if (c20h != null) {
                    c20h.onNetworkInterfaceChanged(this.A01);
                    break;
                }
                break;
            case 1:
                C80093hy c80093hy = (C80093hy) this.A02;
                c80093hy.A01.A0A.A0W.invoke(Integer.valueOf(this.A01), c80093hy.A02);
                break;
            case 2:
                EnumC54222eY enumC54222eY = EnumC54222eY.A0I;
                int i = this.A01;
                List singletonList = Collections.singletonList(new C54432ex(enumC54222eY, null, i, i));
                C14360o3.A07(singletonList);
                return C54412ev.A00(singletonList, C126835oN.A00);
            case 3:
                TreeJNI treeJNI = (TreeJNI) this.A02;
                int i2 = this.A01;
                TreeJNI treeJNI2 = TreeJNI.$redex_init_class;
                return Float.valueOf((float) treeJNI.getDoubleValueByHashCode(i2));
            case 4:
            case 9:
                TreeJNI treeJNI3 = (TreeJNI) this.A02;
                int i3 = this.A01;
                TreeJNI treeJNI4 = TreeJNI.$redex_init_class;
                String stringValueByHashCode = treeJNI3.getStringValueByHashCode(i3);
                if (stringValueByHashCode != null) {
                    return new SimpleImageUrl(stringValueByHashCode);
                }
                return null;
            case 5:
            case 11:
                TreeJNI treeJNI5 = (TreeJNI) this.A02;
                int i4 = this.A01;
                TreeJNI treeJNI6 = TreeJNI.$redex_init_class;
                return treeJNI5.getOptionalTimeValueByHashCode(i4);
            case 6:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                TreeJNI treeJNI7 = (TreeJNI) this.A02;
                int i5 = this.A01;
                TreeJNI treeJNI8 = TreeJNI.$redex_init_class;
                return treeJNI7.getStringValueByHashCode(i5);
            case 7:
                TreeJNI treeJNI9 = (TreeJNI) this.A02;
                int i6 = this.A01;
                TreeJNI treeJNI10 = TreeJNI.$redex_init_class;
                return treeJNI9.getOptionalDoubleListByHashCode(i6);
            case 8:
                TreeJNI treeJNI11 = (TreeJNI) this.A02;
                int i7 = this.A01;
                TreeJNI treeJNI12 = TreeJNI.$redex_init_class;
                Double optionalDoubleValueByHashCode = treeJNI11.getOptionalDoubleValueByHashCode(i7);
                if (optionalDoubleValueByHashCode != null) {
                    return Float.valueOf((float) optionalDoubleValueByHashCode.doubleValue());
                }
                return null;
            case 10:
                TreeJNI treeJNI13 = (TreeJNI) this.A02;
                int i8 = this.A01;
                TreeJNI treeJNI14 = TreeJNI.$redex_init_class;
                return treeJNI13.getOptionalTimeListByHashCode(i8);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                Object fieldByHashCode_UNTYPED = ((TreeJNI) this.A02).getFieldByHashCode_UNTYPED(this.A01);
                if (!(fieldByHashCode_UNTYPED instanceof List) || (list = (List) fieldByHashCode_UNTYPED) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toString());
                }
                return arrayList;
            case 14:
            case Process.SIGTERM /* 15 */:
            default:
                Object fieldByHashCode_UNTYPED2 = ((TreeJNI) this.A02).getFieldByHashCode_UNTYPED(this.A01);
                if (fieldByHashCode_UNTYPED2 != null) {
                    return fieldByHashCode_UNTYPED2.toString();
                }
                return null;
            case 16:
                View requireViewById = ((C6XW) this.A02).A07.getView().requireViewById(this.A01);
                C14360o3.A07(requireViewById);
                return requireViewById;
        }
        return C0eB.A00;
    }
}
