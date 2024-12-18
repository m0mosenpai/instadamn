package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenGraphFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AMk {
    public final InstagramFilterFactoryProvider A01 = new Object();
    public final Map A00 = AbstractC166987dD.A1G();

    public static void A05(TypedParameterMap typedParameterMap, ValueMapFilterModel valueMapFilterModel) {
        valueMapFilterModel.A02("hasOutline", false);
        typedParameterMap.A00.put("hasOutline", false);
        valueMapFilterModel.A00("renderFrameTimeSeconds", Float.NaN);
    }

    public final void A08(String str, Object obj, String str2) {
        InterfaceC199548s4 interfaceC199548s4;
        FilterModel B6R;
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(obj, 0);
        Map map = this.A00;
        if (map.containsKey(obj) && (interfaceC199548s4 = (InterfaceC199548s4) map.get(obj)) != null && (B6R = interfaceC199548s4.B6R()) != null) {
            A03(B6R, str, str2);
        }
    }

    public static TypedParameterMap A00(ValueMapFilterModel valueMapFilterModel) {
        valueMapFilterModel.A00("strength", 1.0f);
        valueMapFilterModel.A00("fontSize", 16.0f);
        Float valueOf = Float.valueOf(16.0f);
        TypedParameterMap typedParameterMap = valueMapFilterModel.A01;
        Map map = typedParameterMap.A02;
        map.put("fontSize", valueOf);
        valueMapFilterModel.A00("fontThickness", 0.5f);
        map.put("fontThickness", Float.valueOf(0.5f));
        return typedParameterMap;
    }

    public static ValueMapFilterModel A01(Integer num, String str) {
        ValueMapFilterModel A01;
        A01 = AHK.A01(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), str, null, 46);
        return A01;
    }

    public static final InterfaceC199548s4 A02(AMk aMk, String str, HashMap hashMap) {
        if (str.equals("text_neon")) {
            float[] fArr = new float[4];
            ValueMapFilterModel A01 = A01(C05F.A0C, "text_neon");
            TypedParameterMap A00 = A00(A01);
            A01.A03("textColor", fArr);
            A00.A01.put("textColor", fArr);
            A05(A00, A01);
            AW9 aw9 = new AW9(aMk.A01, A01);
            Iterator A14 = AbstractC166997dE.A14(hashMap);
            while (A14.hasNext()) {
                A04(A01, A14);
            }
            return aw9;
        }
        Integer num = C05F.A00;
        if (str.equals("sparkle")) {
            float[] fArr2 = new float[4];
            ValueMapFilterModel A012 = A01(C05F.A0C, "sparkle");
            TypedParameterMap A002 = A00(A012);
            A012.A03("textColor", fArr2);
            Map map = A002.A01;
            map.put("textColor", fArr2);
            A05(A002, A012);
            A012.A01("numSparkles", 1);
            A012.A03("sparklePosX", new float[16]);
            A012.A03("sparklePosY", new float[16]);
            A06("sparklePosX", map, 0.5f, 0);
            A06("sparklePosY", map, 0.5f, 0);
            A06("sparkleAlpha", map, 1.0f, 0);
            AW9 aw92 = new AW9(aMk.A01, A012);
            Iterator A142 = AbstractC166997dE.A14(hashMap);
            while (A142.hasNext()) {
                A04(A012, A142);
            }
            return aw92;
        }
        Integer num2 = C05F.A0C;
        if (str.equals("text_shimmer")) {
            float[] fArr3 = new float[4];
            ValueMapFilterModel A013 = A01(num2, "text_shimmer");
            TypedParameterMap A003 = A00(A013);
            A013.A03("textColor", fArr3);
            A003.A01.put("textColor", fArr3);
            A05(A003, A013);
            AW9 aw93 = new AW9(aMk.A01, A013);
            Iterator A143 = AbstractC166997dE.A14(hashMap);
            while (A143.hasNext()) {
                A04(A013, A143);
            }
            return aw93;
        }
        if (str.equals("text_pixel")) {
            float[] fArr4 = new float[4];
            ValueMapFilterModel A014 = A01(num2, "text_pixel");
            TypedParameterMap A004 = A00(A014);
            A014.A03("textColor", fArr4);
            A004.A01.put("textColor", fArr4);
            A05(A004, A014);
            AW9 aw94 = new AW9(aMk.A01, A014);
            Iterator A144 = AbstractC166997dE.A14(hashMap);
            while (A144.hasNext()) {
                A04(A014, A144);
            }
            return aw94;
        }
        if (str.equals("text_haunted")) {
            float[] fArr5 = new float[4];
            ValueMapFilterModel A015 = A01(num2, "text_haunted");
            TypedParameterMap A005 = A00(A015);
            A015.A03("textColor", fArr5);
            A005.A01.put("textColor", fArr5);
            A05(A005, A015);
            AW9 aw95 = new AW9(aMk.A01, A015);
            Iterator A145 = AbstractC166997dE.A14(hashMap);
            while (A145.hasNext()) {
                A04(A015, A145);
            }
            return aw95;
        }
        if (str.equals("VintageFilter")) {
            ColorFilter colorFilter = new ColorFilter("VintageFilter");
            C199838sn c199838sn = new C199838sn(aMk.A01, colorFilter);
            colorFilter.A00 = 0.8f;
            return c199838sn;
        }
        if (str.equals("TestSingle")) {
            DataDrivenFilter dataDrivenFilter = new DataDrivenFilter(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), "data_driven", "\n          varying vec2 sourceTextureCoordinate;\n          uniform vec2 uInputImageSize;\n          uniform float strength;\n\n          varying vec2 vTexCoord;\n\n          void main() {\n            vec4 firstColor = vec4(1.0,0.0,0.0,1.0); //red\n            vec4 middleColor = vec4(0.0,1.0,0.0,1.0); // green\n            vec4 endColor = vec4(0.0,0.0,1.0,1.0); // blue\n\n            vec2 uv = sourceTextureCoordinate;\n            vec4 sampleColor = sampleInput(uv);\n\n            float h = 0.5;\n            vec4 color = mix(mix(firstColor, middleColor, uv.x/h), mix(middleColor, endColor, (uv.x - h)/(1.0 - h)), step(h, uv.x));\n\n            gl_FragColor = toOutputFormat(sampleColor*color);\n          }\n        ", AbstractC167017dG.A0r("strength", Double.valueOf(1.0d)), AbstractC199498rs.A00(), AbstractC199498rs.A00(), true);
            InstagramFilterFactoryProvider instagramFilterFactoryProvider = aMk.A01;
            C14360o3.A0B(instagramFilterFactoryProvider, 2);
            return new AbstractC199818si(instagramFilterFactoryProvider, dataDrivenFilter);
        }
        if (str.equals("TestGraph")) {
            HashMap A0r = AbstractC167017dG.A0r("finalOut", AbstractC167017dG.A0r("strength", Double.valueOf(1.2d)));
            DataDrivenGraphFilter dataDrivenGraphFilter = new DataDrivenGraphFilter(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), AbstractC111324zv.A00(4238), "\n    {\n      \"name\" : \"Lo-Res v2\",\n      \"passes\" : [\n        {\n          \"name\" : \"scaleDown\",\n          \"igid\" : \"bicubic\",\n          \"scale\" : [ 0.5, 0.5 ],\n          \"inputs\" : [\"default\"],\n          \"uniforms\" : {\"scale\" : {\"min\" : 0, \"max\" : 10, \"value\" : 3.35}}\n        },\n        {\n          \"name\" : \"sharpen\",\n          \"igid\" : \"normal\",\n          \"inputs\" : [\"scaleDown\"],\n          \"scale\" : [ 0.5, 0.5 ],\n          \"uniforms\" : {\"sharpenAmt\" : {\"min\" : 0, \"max\" : 10, \"value\" : 0.4}}\n        },\n        {\n          \"name\" : \"scaleUp\",\n          \"igid\" : \"normal\",\n          \"inputs\" : [\"sharpen\"],\n          \"uniforms\" : {\n            \"scale\" :\n                {\"display\" : false, \"constant\" : true, \"min\" : -10, \"max\" : 10, \"value\" : 0.25}\n          }\n        },\n        {\n          \"name\" : \"jpeg\",\n          \"igid\" : \"normal\",\n          \"inputs\" : [\"scaleUp\"],\n          \"scale\" : [ 0.5, 0.5 ],\n          \"uniforms\" : {\n            \"scaleFactor\" : {\"constant\" : true, \"min\" : 50, \"max\" : 400, \"value\" : 230},\n            \"posterization\" : {\"constant\" : true, \"min\" : 2, \"max\" : 176, \"value\" : 64},\n            \"brightness\" : {\"min\" : -1, \"max\" : 1, \"value\" : 0.07}\n          }\n        },\n        {\n          \"name\" : \"finalOut\",\n          \"glsl\" : \"varying vec2 sourceTextureCoordinate;\n          uniform vec2 uInputImageSize;\n          uniform float strength;\n          uniform sampler2D auxSampler1;\n\n          varying vec2 vTexCoord;\n          void main() {\n          vec4 firstColor = vec4(1.0,0.0,0.0,1.0);\n          vec4 middleColor = vec4(0.0,1.0,0.0,1.0);\n          vec4 endColor = vec4(0.0,0.0,1.0,1.0);\n\n          vec2 uv = sourceTextureCoordinate;\n          vec4 sampleColor = sampleInput(uv);\n          vec4 sampleColor2 = texture2D(auxSampler1, uv);\n\n          float h = 0.5;\n          vec4 color = sampleColor2 * mix(mix(firstColor, middleColor, uv.x/h), mix(middleColor, endColor, (uv.x - h)/(1.0 - h)), step(h, uv.x));\n          vec4 newColor = vec4(strength,strength,color.b, 1.0);\n          gl_FragColor = toOutputFormat(sampleColor*color);\n          }\",\n          \"inputs\" : [\"default\",\"jpeg\"],\n          \"scale\" : [ 1.0, 1.0 ],\n          \"uniforms\" : {\n            \"scale\" :\n                {\"display\" : false, \"constant\" : true, \"min\" : -10, \"max\" : 10, \"value\" : 0.25}\n          }\n        }\n      ]\n    }\n    ", A0r, AbstractC199498rs.A00(), AbstractC199498rs.A00(), true);
            InstagramFilterFactoryProvider instagramFilterFactoryProvider2 = aMk.A01;
            C14360o3.A0B(instagramFilterFactoryProvider2, 2);
            return new AbstractC199818si(instagramFilterFactoryProvider2, dataDrivenGraphFilter);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x001b. Please report as an issue. */
    public final Integer A07(Object obj) {
        FilterModel B6R;
        String filterName;
        InterfaceC199548s4 interfaceC199548s4 = (InterfaceC199548s4) this.A00.get(obj);
        if (interfaceC199548s4 != null && (B6R = interfaceC199548s4.B6R()) != null && (filterName = B6R.getFilterName()) != null) {
            switch (filterName.hashCode()) {
                case -2103499532:
                    if (filterName.equals("text_pixel")) {
                        return C05F.A0N;
                    }
                    break;
                case -2011710186:
                    if (filterName.equals("sparkle")) {
                        return C05F.A00;
                    }
                    break;
                case -1570040721:
                    if (filterName.equals("text_haunted")) {
                        return C05F.A0Y;
                    }
                    break;
                case -1037749848:
                    if (filterName.equals("text_neon")) {
                        return C05F.A01;
                    }
                    break;
                case -208149521:
                    if (filterName.equals("text_shimmer")) {
                        return C05F.A0C;
                    }
                    break;
            }
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0014. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b0 A[PHI: r9
      0x00b0: PHI (r9v6 com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) = 
      (r9v1 com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel)
      (r9v7 com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel)
     binds: [B:54:0x0031, B:9:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7 A[PHI: r9
      0x00c7: PHI (r9v5 com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) = 
      (r9v1 com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel)
      (r9v7 com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel)
     binds: [B:54:0x0031, B:9:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de A[PHI: r9
      0x00de: PHI (r9v4 com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) = 
      (r9v1 com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel)
      (r9v7 com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel)
     binds: [B:54:0x0031, B:9:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5 A[PHI: r9
      0x00f5: PHI (r9v3 com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) = 
      (r9v1 com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel)
      (r9v7 com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel)
     binds: [B:54:0x0031, B:9:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111 A[PHI: r9
      0x0111: PHI (r9v2 com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) = 
      (r9v1 com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel)
      (r9v7 com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel)
     binds: [B:54:0x0031, B:9:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AMk.A03(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel, java.lang.String, java.lang.String):void");
    }

    public static void A04(FilterModel filterModel, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        A03(filterModel, (String) entry.getKey(), (String) entry.getValue());
    }

    public static void A06(Object obj, Map map, float f, int i) {
        float[] fArr = (float[]) map.get(obj);
        if (fArr != null) {
            fArr[i] = f;
        }
    }
}
