package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.models.IgModelLoader;
import com.facebook.models.Manifest;
import com.facebook.models.ManifestLoaderProxy;
import com.facebook.models.UnresolvedModelAssetMetadata;
import com.facebook.models.UnresolvedModelMetadata;
import com.facebook.models.VoltronModuleLoaderProxy;
import com.facebook.models.interfaces.IManifestLoader;
import com.facebook.models.interfaces.ModelLoaderBase;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.service.tigon.IGTigonService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.8lc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195908lc {
    public static IgModelLoader A00;

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.8lj] */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.facebook.models.interfaces.ModelLoaderBase, com.facebook.models.IgModelLoader] */
    public static final synchronized IgModelLoader A00(AbstractC12990ll abstractC12990ll) {
        IgModelLoader igModelLoader;
        synchronized (C195908lc.class) {
            IgModelLoader igModelLoader2 = A00;
            igModelLoader = igModelLoader2;
            if (igModelLoader2 == null) {
                try {
                    Class cls = IgModelLoader.TAG;
                    String canonicalPath = AbstractC23881Ey.A00().AXd(null, 420392075).getCanonicalPath();
                    C14360o3.A0A(abstractC12990ll);
                    IGTigonService tigonService = IGTigonService.getTigonService(abstractC12990ll);
                    AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
                    AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = new AndroidAsyncExecutorFactory(C14250np.A00().A00);
                    final C195928le A002 = C195928le.A00(abstractC12990ll);
                    C14360o3.A07(A002);
                    ?? modelLoaderBase = new ModelLoaderBase(IgModelLoader.initHybridWithJavaManifestLoader(canonicalPath, C07650ae.A01, tigonService, androidAsyncExecutorFactory2, new ManifestLoaderProxy(new IManifestLoader(A002) { // from class: X.8lg
                        public final InterfaceC40711ue A00;

                        @Override // com.facebook.models.interfaces.IManifestLoader
                        public final ListenableFuture load(String str, long j, Map map) {
                            C14360o3.A0B(str, 0);
                            C14360o3.A0B(map, 2);
                            return A00(Long.valueOf(j), str, map);
                        }

                        /* JADX WARN: Type inference failed for: r5v0, types: [X.1Ke, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
                        private final SettableFuture A00(Long l, String str, Map map) {
                            final ?? obj = new Object();
                            C0CA A02 = GraphQlCallInput.A02.A02();
                            C0CA.A00(A02, str, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                            if (l != null) {
                                long longValue = l.longValue();
                                if (longValue > 2147483647L || longValue < -2147483648L) {
                                    obj.setException(new ArithmeticException("Version number overflow! Valid version range is [-2147483648, 2147483647]."));
                                }
                                if (longValue != -1) {
                                    C0CA.A00(A02, Integer.valueOf((int) longValue), "version");
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            Iterator it = map.keySet().iterator();
                            while (it.hasNext()) {
                                arrayList.add(it.next());
                            }
                            C2JO c2jo = new C2JO();
                            c2jo.A05("bytecodeVersion", new ArrayList());
                            c2jo.A05("cachedModelAssets", arrayList);
                            C2JM c2jm = new C2JM();
                            c2jm.A00.A02().A0E(A02, "model_request_metadata");
                            c2jm.A00(c2jo, "client_capability_metadata");
                            C907442n c907442n = new C907442n(c2jm, C208839Lr.class, "NativeMLModelQuery", false);
                            this.A00.ATV(new InterfaceC48212Jk() { // from class: X.9Li
                                @Override // X.InterfaceC48212Jk
                                public final void invoke(Throwable th) {
                                    Manifest manifest = new Manifest();
                                    manifest.setQueryStatus(C9MQ.FAILURE.toString(), th.getMessage());
                                    SettableFuture.this.set(manifest);
                                }
                            }, new InterfaceC48192Ji() { // from class: X.9Lj
                                @Override // X.InterfaceC48192Ji
                                public final void invoke(AnonymousClass436 anonymousClass436) {
                                    Object Bos;
                                    int i;
                                    int i2;
                                    long j;
                                    int i3;
                                    if (anonymousClass436 != null && (Bos = anonymousClass436.Bos()) != null) {
                                        AbstractC907342m A003 = ((AbstractC907342m) Bos).A00(C208889Lw.class, "aim_model_manifest");
                                        if (A003 == null) {
                                            SettableFuture.this.setException(new Throwable("GraphQL returns empty manifest."));
                                            return;
                                        }
                                        Manifest manifest = new Manifest();
                                        manifest.setResolvedFromCache(false);
                                        C9MQ c9mq = C9MQ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                                        if (A003.A04(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, c9mq) != null) {
                                            C9MQ c9mq2 = (C9MQ) A003.A04(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, c9mq);
                                            C14360o3.A0A(c9mq2);
                                            manifest.setQueryStatus(c9mq2.name(), A003.A05("status_details"));
                                        }
                                        C9MR c9mr = C9MR.A02;
                                        if (A003.A04(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c9mr) != null) {
                                            C9MR c9mr2 = (C9MR) A003.A04(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c9mr);
                                            C14360o3.A0A(c9mr2);
                                            manifest.setQueryEntryPoint(AbstractC167007dF.A0h(c9mr2.name()));
                                        }
                                        JSONObject jSONObject = A003.A00;
                                        if (!jSONObject.isNull("model_count")) {
                                            i = jSONObject.optInt("model_count");
                                        } else {
                                            i = -1;
                                        }
                                        if (!jSONObject.isNull("asset_count")) {
                                            i2 = jSONObject.optInt("asset_count");
                                        } else {
                                            i2 = -1;
                                        }
                                        manifest.setQueryResponseExpectation(i, i2);
                                        ImmutableList A022 = A003.A02("models", C208899Lx.class);
                                        C14360o3.A07(A022);
                                        C1LC it2 = A022.iterator();
                                        C14360o3.A07(it2);
                                        while (it2.hasNext()) {
                                            AbstractC907342m abstractC907342m = (AbstractC907342m) it2.next();
                                            String A05 = abstractC907342m.A05(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                            JSONObject jSONObject2 = abstractC907342m.A00;
                                            if (!jSONObject2.isNull("version")) {
                                                j = jSONObject2.optInt("version");
                                            } else {
                                                j = -1;
                                            }
                                            UnresolvedModelMetadata unresolvedModelMetadata = new UnresolvedModelMetadata(A05, j);
                                            ImmutableList A023 = abstractC907342m.A02("assets", C208909Ly.class);
                                            C14360o3.A07(A023);
                                            C1LC it3 = A023.iterator();
                                            C14360o3.A07(it3);
                                            while (it3.hasNext()) {
                                                AbstractC907342m abstractC907342m2 = (AbstractC907342m) it3.next();
                                                if (abstractC907342m2.A00(C208919Lz.class, "metadata") != null) {
                                                    AbstractC907342m A004 = abstractC907342m2.A00(C208919Lz.class, "metadata");
                                                    C14360o3.A0A(A004);
                                                    i3 = A004.A00.optInt("bytecode_version");
                                                } else {
                                                    i3 = -1;
                                                }
                                                UnresolvedModelAssetMetadata unresolvedModelAssetMetadata = UnresolvedModelAssetMetadata.$redex_init_class;
                                                UnresolvedModelAssetMetadata unresolvedModelAssetMetadata2 = new UnresolvedModelAssetMetadata(abstractC907342m2.A05(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), i3, abstractC907342m2.A05("url"), abstractC907342m2.A05("cache_key"), abstractC907342m2.A05("md5_hash"), abstractC907342m2.A05("asset_handle"), abstractC907342m2.A05("creation_time"));
                                                ImmutableList A024 = abstractC907342m2.A02("delta_cache", C9Z3.class);
                                                C14360o3.A07(A024);
                                                C1LC it4 = A024.iterator();
                                                C14360o3.A07(it4);
                                                while (it4.hasNext()) {
                                                    AbstractC907342m abstractC907342m3 = (AbstractC907342m) it4.next();
                                                    unresolvedModelAssetMetadata2.addDeltaCacheEntryNative(abstractC907342m3.A05("base_md5"), abstractC907342m3.A05("delta_url"));
                                                }
                                                unresolvedModelMetadata.addAsset(unresolvedModelAssetMetadata2);
                                            }
                                            ImmutableList A025 = abstractC907342m.A02("properties", C9Z4.class);
                                            C14360o3.A07(A025);
                                            C1LC it5 = A025.iterator();
                                            C14360o3.A07(it5);
                                            while (it5.hasNext()) {
                                                AbstractC907342m abstractC907342m4 = (AbstractC907342m) it5.next();
                                                unresolvedModelMetadata.addPropertyNative(abstractC907342m4.A05(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), abstractC907342m4.A05(IntentModule.EXTRA_MAP_KEY_FOR_VALUE));
                                            }
                                            manifest.addModel(unresolvedModelMetadata);
                                        }
                                        SettableFuture.this.set(manifest);
                                        return;
                                    }
                                    SettableFuture.this.setException(new Throwable("GraphQL returns empty response."));
                                }
                            }, c907442n);
                            return obj;
                        }

                        {
                            this.A00 = A002;
                        }

                        @Override // com.facebook.models.interfaces.IManifestLoader
                        public final ListenableFuture load(String str, Map map) {
                            C14360o3.A0B(str, 0);
                            C14360o3.A0B(map, 1);
                            return A00(null, str, map);
                        }
                    }), new VoltronModuleLoaderProxy(new Object())));
                    A00 = modelLoaderBase;
                    igModelLoader = modelLoaderBase;
                } catch (IOException e) {
                    C0K8.A05(C195908lc.class, "Exception from getCanonicalPath()", e);
                    igModelLoader = null;
                }
            }
        }
        return igModelLoader;
    }
}
